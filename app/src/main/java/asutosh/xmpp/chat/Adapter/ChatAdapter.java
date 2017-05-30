package asutosh.xmpp.chat.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.curioustechizen.ago.RelativeTimeTextView;

import java.util.List;
import asutosh.xmpp.chat.Model.Chat;
import asutosh.xmpp.chat.R;


public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private List<Chat> mList;
    private Chat mChatFunctionModel;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout ll_messageSent, ll_messageGot;
        public TextView tv_sent_string, tv_got_string;
        public RelativeTimeTextView rtv_got_date, rtv_sent_date;

        public MyViewHolder(View view) {
            super(view);

            ll_messageSent = (LinearLayout)view.findViewById(R.id.messageSent);
            ll_messageGot = (LinearLayout)view.findViewById(R.id.messageGot);
            tv_sent_string = (TextView)view.findViewById(R.id.sent_string);
            tv_got_string = (TextView)view.findViewById(R.id.got_string);
            rtv_got_date = (RelativeTimeTextView)view.findViewById(R.id.got_date);
            rtv_sent_date = (RelativeTimeTextView)view.findViewById(R.id.sent_date);


        }
    }


    public ChatAdapter(List<Chat> list) {
        this.mList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        
    /**
     * The logic for showing the chat messages:
     * 1. If message is sent from the app user, show Views for 'message sent' and hide the Views for 'message received'.
     * 2. If message is received from somewhere else, show Views for 'message got' and hide the Views for 'message sent'.
     */

        mChatFunctionModel = mList.get(position);

        if(mChatFunctionModel.getSentMessage() != null && mChatFunctionModel.getGotMessage() != null){
            if(!mChatFunctionModel.getSentMessage().trim().equals("")){
                holder.ll_messageSent.setVisibility(View.VISIBLE);
                holder.ll_messageGot.setVisibility(View.GONE);
                holder.tv_sent_string.setText(mChatFunctionModel.getSentMessage().trim());
                holder.rtv_sent_date.setReferenceTime(mChatFunctionModel.getSentTime());
            }

            else if(!mChatFunctionModel.getGotMessage().trim().equals("")){
                holder.ll_messageGot.setVisibility(View.VISIBLE);
                holder.ll_messageSent.setVisibility(View.GONE);
                holder.tv_got_string.setText(mChatFunctionModel.getGotMessage().trim());
                holder.rtv_got_date.setReferenceTime(mChatFunctionModel.getGotTime());
            }
        }


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}

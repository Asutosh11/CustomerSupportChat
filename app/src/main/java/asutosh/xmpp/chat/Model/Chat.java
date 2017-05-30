package asutosh.xmpp.chat.Model;


public class Chat {

    private String SentMessage, GotMessage;
    private long sentTime, gotTime;

    public String getSentMessage() {
        return SentMessage;
    }

    public void setSentMessage(String sentMessage) {
        SentMessage = sentMessage;
    }

    public String getGotMessage() {
        return GotMessage;
    }

    public void setGotMessage(String gotMessage) {
        GotMessage = gotMessage;
    }

    public long getSentTime() {
        return sentTime;
    }

    public void setSentTime(long sentTime) {
        this.sentTime = sentTime;
    }

    public long getGotTime() {
        return gotTime;
    }

    public void setGotTime(long gotTime) {
        this.gotTime = gotTime;
    }
}

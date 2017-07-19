package asutosh.xmpp.chat.Model;

import java.io.Serializable;

public class ChatConnection implements Serializable {

    private String xmppCustomerUsername, xmppCustomerPassword, xmppPortNo, xmppServiceName, xmppHostName;
    private String xmppIdOfSupportExecutive, chatWindowTitle;


    public String getxmppCustomerUsername() {
        return xmppCustomerUsername;
    }

    public void setxmppCustomerUsername(String xmppCustomerUsername) {
        this.xmppCustomerUsername = xmppCustomerUsername;
    }

    public String getxmppCustomerPassword() {
        return xmppCustomerPassword;
    }

    public void setxmppCustomerPassword(String xmppCustomerPassword) {
        this.xmppCustomerPassword = xmppCustomerPassword;
    }

    public String getxmppPortNo() {
        return xmppPortNo;
    }

    public void setxmppPortNo(String xmppPortNo) {
        this.xmppPortNo = xmppPortNo;
    }

    public String getxmppServiceName() {
        return xmppServiceName;
    }

    public void setxmppServiceName(String xmppServiceName) {
        this.xmppServiceName = xmppServiceName;
    }

    public String getxmppHostName() {
        return xmppHostName;
    }

    public void setxmppHostName(String xmppHostName) {
        this.xmppHostName = xmppHostName;
    }

    public String getxmppIdOfSupportExecutive() {
        return xmppIdOfSupportExecutive;
    }

    public void setxmppIdOfSupportExecutive(String xmppIdOfSupportExecutive) {
        this.xmppIdOfSupportExecutive = xmppIdOfSupportExecutive;
    }  

    public String getchatWindowTitle() {
        return chatWindowTitle;
    }

    public void setchatWindowTitle(String chatWindowTitle) {
        this.chatWindowTitle = chatWindowTitle;
    }


}

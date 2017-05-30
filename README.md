[![](https://jitpack.io/v/Asutosh11/CustomerSupportChat.svg)](https://jitpack.io/#Asutosh11/CustomerSupportChat)
# Android Customer Support Chat Library
This is a Customer support chat library that you can add to your Android applications. 

<b>How it works?</b><br>
You need to enter your XMPP server details, details of your user's XMPP account and XMPP id of the customer support executive sitting somewhere else on an XMPP client.
The library opens a chat window for your app user and the customer support executive to chat.

<b>Screenshot</b><br>
<kbd>
<img src="https://github.com/Asutosh11/CustomerSupportChat/blob/master/screenshot1.jpg" alt="Screenshot" width="300px"/>
</kbd>

<br>
<b>Usage</b>
<hr>


1. Add the dependency to your build.gradle

 ```
allprojects {
    repositories {
        maven {
            url 'https://jitpack.io'
        }
    }
}
dependencies {
    compile 'com.github.Asutosh11:CustomerSupportChat:1.0'
}

 ```

2. This is how you use it

```
ChatConnection mChatConnection = new ChatConnection();
mChatConnection.setxmppCustomerUsername("test1");
mChatConnection.setxmppCustomerPassword("test1");
mChatConnection.setxmppPortNo("5222");
mChatConnection.setxmppHostName("asutosh.p1.im");
mChatConnection.setxmppServiceName("asutosh.p1.im");
mChatConnection.setxmppIdOfSupportExecutive("test2@asutosh.p1.im");
mChatConnection.setchatWindowTitle("Support chat window");
ChatActivity.startChat(mChatConnection, MainActivity.this);
```
<hr>

### Thanks

 * [Smack](https://github.com/igniterealtime/Smack)
 * [android-ago](https://github.com/curioustechizen/android-ago)


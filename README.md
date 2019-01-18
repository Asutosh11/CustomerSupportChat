[![](https://jitpack.io/v/Asutosh11/CustomerSupportChat.svg)](https://jitpack.io/#Asutosh11/CustomerSupportChat)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Customer%20Support%20Chat%20library-blue.svg?style=flat)](https://android-arsenal.com/details/1/5847)
# Android Customer Support Chat Library
<b>This is a Customer support chat library built using Smack API that you can add to your Android applications. <br><br>
(Please note that I'm working on coverting the architecture of this library to MVVM, will notify when its done)</b>
<br><br>
Once I was in search of a customer support chat library that I could embed in my Android app easily without writing much code and without taking much time.
I couldn't find any. So later I made this library to accomplish that task. Try using it. Try experimenting with it.

<b>How it works?</b><br>
You need to enter your XMPP server details, details of your user's XMPP account and XMPP id of the customer support executive sitting somewhere else on an XMPP client.
The library opens a chat window for your app user and the customer support executive to chat.

<b>Screenshots</b><br><br>
<kbd>
<img src="https://github.com/Asutosh11/CustomerSupportChat/blob/master/screenshot1.jpg" alt="Screenshot1" width="300px"/>
</kbd>
&nbsp; &nbsp;
<kbd>
<img src="https://github.com/Asutosh11/CustomerSupportChat/blob/master/screenshot2.jpg" alt="Screenshot2" width="300px"/>
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
    compile 'com.github.Asutosh11:CustomerSupportChat:1.1'
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


### License

<a href = 'https://github.com/Asutosh11/CustomerSupportChat/blob/master/LICENSE.md'>Apache License 2.0</a>

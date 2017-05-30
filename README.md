# CustomerSupportChat

Add the dependency to your build.gradle

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

This is how you use it

```
ChatConnection mChatConnection = new ChatConnection();
mChatConnection.setxmppCustomerUsername("test1");
mChatConnection.setxmppCustomerPassword("test1");
mChatConnection.setxmppPortNo("5222");
mChatConnection.setxmppHostName("asutosh.p1.im");
mChatConnection.setxmppServiceName("asutosh.p1.im");
mChatConnection.setxmppIdOfSupportExecutive("test2@asutosh.p1.im");
mChatConnection.setchatWindowTitle("Support chat window");
ChatActivity.startChat(mChatConnection, MainActivity.this)
```


### Thanks

 * [Smack](https://github.com/igniterealtime/Smack)
 * [android-ago](https://github.com/curioustechizen/android-ago)

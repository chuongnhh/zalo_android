package chuongnh.hcm.zalo.Model;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class ModelChat {
    public ModelChat(String userImage, String userName, String lastMessageContent, String lastMessageTime) {
        UserImage = userImage;
        UserName = userName;
        LastMessageContent = lastMessageContent;
        LastMessageTime = lastMessageTime;
    }

    public String UserImage;
    public String UserName;
    public String LastMessageContent;
    public String LastMessageTime;

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLastMessageContent() {
        return LastMessageContent;
    }

    public void setLastMessageContent(String lastMessageContent) {
        LastMessageContent = lastMessageContent;
    }

    public String getLastMessageTime() {
        return LastMessageTime;
    }

    public void setLastMessageTime(String lastMessageTime) {
        LastMessageTime = lastMessageTime;
    }
}

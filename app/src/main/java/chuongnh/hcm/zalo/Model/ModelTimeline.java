package chuongnh.hcm.zalo.Model;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class ModelTimeline {

    public ModelTimeline(String username, String userImage, String postTime, String postContent) {
        Username = username;
        UserImage = userImage;
        PostTime = postTime;
        PostContent = postContent;
    }

    public String Username;
    private String UserImage;

    public String PostTime;
    public String PostContent;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public String getPostTime() {
        return PostTime;
    }

    public void setPostTime(String postTime) {
        PostTime = postTime;
    }

    public String getPostContent() {
        return PostContent;
    }

    public void setPostContent(String postContent) {
        PostContent = postContent;
    }
}

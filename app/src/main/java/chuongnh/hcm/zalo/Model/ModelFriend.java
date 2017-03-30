package chuongnh.hcm.zalo.Model;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class ModelFriend {
    public ModelFriend(String userImage, String userName) {
        UserImage = userImage;
        UserName = userName;
    }

    public String UserImage;
    public String UserName;

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
}

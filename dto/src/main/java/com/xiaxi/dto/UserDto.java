package com.xiaxi.dto;


/**
 * Created by BaoCai on 2018/8/13. Description:
 */
public class UserDto {

    private String userName;

    private Long userId;

    public static UserDto instance(String userName , Long userId){
        UserDto dto = new UserDto();
        dto.setUserId(userId);
        dto.setUserName(userName);
        return dto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

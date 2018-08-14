package com.xiaxi.springcloud.feignclient.controller;

import com.xiaxi.dto.UserDto;
import com.xiaxi.springcloud.feignclient.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BaoCai on 2018/8/13. Description:
 */

@RestController
public class UserController {

    @Autowired
    private UserApi userApi;

    @GetMapping("/find_user/{user_id}")
    public UserDto getUserById(@PathVariable(value = "user_id") Long userId){
        return userApi.getByUser(userId);
    }

}

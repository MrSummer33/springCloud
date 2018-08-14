package com.xiaxi.springcloud.feignuser.controller;

import com.xiaxi.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BaoCai on 2018/8/13. Description:
 */

@RestController
public class UserController {

    @GetMapping("/find_user/{user_id}")
    public UserDto getUserById(@PathVariable(value = "user_id") Long userId){
        return UserDto.instance("科比",userId);
    }

}

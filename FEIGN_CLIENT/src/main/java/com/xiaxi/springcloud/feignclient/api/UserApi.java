package com.xiaxi.springcloud.feignclient.api;

import com.xiaxi.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by BaoCai on 2018/8/13. Description:
 */
@FeignClient(name = "feign-user")
public interface UserApi {

    @GetMapping("/find_user/{user_id}")
    UserDto getByUser(@PathVariable(value = "user_id") Long userId);

}

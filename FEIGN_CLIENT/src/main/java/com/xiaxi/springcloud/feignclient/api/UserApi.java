package com.xiaxi.springcloud.feignclient.api;

import com.xiaxi.dto.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BaoCai on 2018/8/13. Description:
 */
@FeignClient(name = "feign-user")
public interface UserApi {

    @RequestMapping(value = "/find_user/{user_id}", method = RequestMethod.GET)
    UserDto getByUser(@PathVariable(value = "user_id") Long userId);

}

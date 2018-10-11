package com.example.cloud;

import com.example.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhumingli
 * @create 2018-10-11 下午9:48
 * @desc
 **/
@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    /**
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    public User findById(@PathVariable("id") Long id) ;
}

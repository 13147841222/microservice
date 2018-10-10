package com.example.cloud.microservicesimpleprovideruser.web.controller;

import com.example.cloud.microservicesimpleprovideruser.entity.User;
import com.example.cloud.microservicesimpleprovideruser.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhumingli
 * @create 2018-10-08 下午10:07
 * @desc
 **/
@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }
}

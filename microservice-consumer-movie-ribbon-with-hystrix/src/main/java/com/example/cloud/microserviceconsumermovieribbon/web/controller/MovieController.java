package com.example.cloud.microservicesimpleconsumermovie.web.controller;

import com.example.cloud.microservicesimpleconsumermovie.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author zhumingli
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(this.userServicePath + id, User.class);
    }

    public User findByIdFallback(Long id){
        User user = new User();
        user.setId(0L);
        return user;
    }
}

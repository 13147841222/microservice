package com.example.cloud.feign;


import config.Configuration2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhumingli
 * @create 2018-10-12 下午8:55
 * @desc 有 url 时 是给自定义的client起一个名称   没有  url 时  是指向 application 的名字
 **/
@org.springframework.cloud.netflix.feign.FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = Configuration2.class)
public interface FeignClient {

    @RequestMapping(value = "/eureka/apps/{serviceName}", method = RequestMethod.GET)
    public String test(@PathVariable("serviceName")String serviceName );
}

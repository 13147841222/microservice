package config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @author zhumingli
 * @create 2018-10-11 下午11:08
 * @desc
 **/
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
}

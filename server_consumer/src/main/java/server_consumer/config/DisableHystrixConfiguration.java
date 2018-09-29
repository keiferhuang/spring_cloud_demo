package server_consumer.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author keifer
 * @createTime 2018/9/28 17:16
 * @description
 */

/**
 *关闭Hystrix配置类
 */
//开启后无法通过fallback的方法来进行服务降级
//@Configuration
//public class DisableHystrixConfiguration {
//
//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder(){
//        return Feign.builder();
//    }
//}

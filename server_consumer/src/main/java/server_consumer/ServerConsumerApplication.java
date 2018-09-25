package server_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author keifer
 * @createTime 2018/9/20 14:46
 * @description
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServerConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class,args);
    }

}

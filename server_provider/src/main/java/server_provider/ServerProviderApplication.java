package server_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author keifer
 * @createTime 2018/9/20 11:31
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class,args);
    }
}

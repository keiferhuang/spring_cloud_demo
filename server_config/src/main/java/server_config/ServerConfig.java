package server_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author keifer
 * @createTime 2018/9/29 15:09
 * @description
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ServerConfig {
    public static void main(String[] args) {
        SpringApplication.run(ServerConfig.class,args);
    }
}

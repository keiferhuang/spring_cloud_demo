package server_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author keifer
 * @createTime 2018/9/29 15:09
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class ServerConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerConfigApplication.class,args);
    }
}

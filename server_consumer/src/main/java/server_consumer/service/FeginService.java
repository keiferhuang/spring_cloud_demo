package server_consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author keifer
 * @createTime 2018/9/20 15:22
 * @description
 */
@FeignClient(name = "server-provider")
public interface FeginService {

    @RequestMapping(value = "/hello/{name}")
    String demoHiWorld(@PathVariable(value = "name") String name);

}

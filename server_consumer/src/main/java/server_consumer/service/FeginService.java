package server_consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import server_consumer.service.backImpl.FeginFallBack;

/**
 * @author keifer
 * @createTime 2018/9/20 15:22
 * @description
 */

//可以针对关闭Hystrix
// @FeignClient(name="server-provider",configuration = DisableHystrixConfiguration.class)
@FeignClient(name = "server-provider",fallback = FeginFallBack.class)
public interface FeginService {

    @RequestMapping(value = "/hello/{name}")
    String demoHiWorld(@PathVariable(value = "name") String name);

}

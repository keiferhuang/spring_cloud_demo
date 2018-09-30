package server_provider.controller;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;



/**
 * @author keifer
 * @createTime 2018/9/20 11:32
 * @description
 */
@Controller
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Value("${server.port}")
    String port;
    @Value("${wow.axl}")
    private String wow;
    @Value("${soul}")
    private String dz;

    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable(value = "name") String name) throws Exception{

        List<ServiceInstance> instances = discoveryClient.getInstances("server-provider");
        int time = new Random().nextInt(3000);
        System.out.println("time:"+time);
        Thread.sleep(time);
        for(ServiceInstance serviceInstance : instances){
            if (String.valueOf(serviceInstance.getPort()).equals(port)){
                System.out.println(serviceInstance.getHost() + "," + serviceInstance.getPort() + "," + serviceInstance.getServiceId());
            }
        }
        return "hello World ~"+"Im form" + port +name + dz + wow ;
    }
}

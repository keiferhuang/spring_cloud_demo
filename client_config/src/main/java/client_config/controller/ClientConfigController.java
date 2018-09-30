package client_config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author keifer
 * @createTime 2018/9/30 10:30
 * @description
 */
@Controller
public class ClientConfigController {

    @Value("${name}")
    private String name;


    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return name;
    }
}

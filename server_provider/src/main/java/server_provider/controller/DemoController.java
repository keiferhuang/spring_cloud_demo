package server_provider.controller;

import com.sun.jersey.spi.StringReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author keifer
 * @createTime 2018/9/20 11:32
 * @description
 */
@Controller
public class DemoController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable(value = "name") String name) {
        return "hello World ~"+"Im form" + port +name ;
    }
}

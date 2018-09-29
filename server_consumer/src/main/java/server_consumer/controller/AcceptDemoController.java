package server_consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import server_consumer.service.FeginService;


/**
 * @author keifer
 * @createTime 2018/9/20 14:52
 * @description
 */
@Controller
public class AcceptDemoController {


    @Autowired
    private FeginService service;

    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public  String helloAgain(@PathVariable(value = "name") String name){
        return service.demoHiWorld(name);
    }
}

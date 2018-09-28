package server_consumer.service.backImpl;

import org.springframework.stereotype.Component;
import server_consumer.service.FeginService;

/**
 * @author keifer
 * @createTime 2018/9/28 17:45
 * @description
 */
@Component
public class FeginFallBack implements FeginService {
    @Override
    public String demoHiWorld(String name) {
        return "调用server-provider服务超时失败,调用方法demoHiWorld(String name)-打印name参数"+name;
    }
}

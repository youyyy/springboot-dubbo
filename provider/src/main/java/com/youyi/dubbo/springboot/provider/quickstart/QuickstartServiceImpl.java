package com.youyi.dubbo.springboot.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.youyi.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;


@Service(interfaceClass = ServiceAPI.class)
@Component
public class QuickstartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "provider-message="+message;
    }
}

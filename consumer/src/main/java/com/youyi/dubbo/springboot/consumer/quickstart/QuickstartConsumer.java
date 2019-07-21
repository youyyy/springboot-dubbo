package com.youyi.dubbo.springboot.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.youyi.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickstartConsumer {
    @Reference(url = "dubbo://localhost:20880")
    private ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(message);
        System.out.println(serviceAPI.sendMessage(message));
    }
}

package org.example.rocketmqspringboot.controller;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.example.rocketmqspringboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/demo")
public class SendController {

    @Autowired
    RocketMQTemplate  rocketMQTemplate;//模板类：建立连接及断连接

    @GetMapping("/send")
    public String send(){
        //发送逻辑
        String meg="hello world!";
        User user = new User("zhangsan", 12);
        //convert 消息转换为底层的字节数组
        //rocketMQTemplate.convertAndSend("topic10",meg);
        rocketMQTemplate.convertAndSend("topic10",user);

        //同步消息
        SendResult syncSend = rocketMQTemplate.syncSend("topic10", user);

        //异步消息
        rocketMQTemplate.asyncSend("topic10", user, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                //成功
                System.out.println(sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                //失败
                System.out.println(throwable);
            }
        },1000);

        //单向消息
        rocketMQTemplate.sendOneWay("topic10",user);

        //延时消息
        rocketMQTemplate.syncSend("topic10", MessageBuilder.withPayload(meg).build(),2000,2);

        //批量消息
        ArrayList<org.apache.rocketmq.common.message.Message> msgList = new ArrayList<>();
        String mag="hello world!";
        org.apache.rocketmq.common.message.Message msg1 = new org.apache.rocketmq.common.message.Message("topic4", "tag1", mag.getBytes());
        msgList.add(msg1);
        String mag2="hello world2";
        org.apache.rocketmq.common.message.Message msg2 = new org.apache.rocketmq.common.message.Message("topic4", "tags1", mag2.getBytes());
        msgList.add(msg2);
        String mag3="hello world3";
        org.apache.rocketmq.common.message.Message msg3 = new Message("topic4", "tags1", mag3.getBytes());
        msgList.add(msg3);
        rocketMQTemplate.syncSend("topic10",msgList,1000);

        return "success!";
    }

}

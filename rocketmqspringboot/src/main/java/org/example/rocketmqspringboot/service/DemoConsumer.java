package org.example.rocketmqspringboot.service;

import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.annotation.SelectorType;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.example.rocketmqspringboot.domain.User;
import org.springframework.stereotype.Service;

@Service
//@RocketMQMessageListener 监听的topic tag 以及所属的组,tag过滤
//@RocketMQMessageListener(topic = "topic10",consumerGroup = "group1")
//sql过滤
@RocketMQMessageListener(topic = "topic10",consumerGroup = "group1",
        selectorType = SelectorType.SQL92,
        selectorExpression = "age>91",
        messageModel = MessageModel.BROADCASTING)
public class DemoConsumer implements RocketMQListener<User> {

    //做的业务逻辑
    @Override
    public void onMessage(User user) {
        System.out.println(user);
    }
}

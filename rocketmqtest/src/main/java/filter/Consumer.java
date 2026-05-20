package filter;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {
    public static void main(String[] args) throws MQClientException {
        //谁来收
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group1");
        //从哪里收消息？
        consumer.setNamesrvAddr("localhost:9876");
        //监听哪个消息队列
        //按照tag过滤
        //consumer.subscribe("topic6","vip || tag1");
        //消费者sql过滤，根据消息的属性过滤，默认未开启
        //处理业务流程 注册一个监听器
        consumer.subscribe("topic6", MessageSelector.bySql("age>16"));
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                //写我们的业务逻辑
                for (MessageExt messageExt : list) {
                    byte[] body = messageExt.getBody();
                    System.out.println(new String(body));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.out.println("消费者启动起来了");
        //不要关消费者，因为开启了监听器
    }
}

package type;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

//发送消息
public class ProducerDelay {
    public static void main(String[] args) throws Exception {
        //谁来发？
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        //发给谁？
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        //怎么发？
        //发什么？
        String meg="hello world!";
        Message message = new Message("topic1", "tag1", meg.getBytes());
        //延时消息 分别设置每一条消息的延时等级
        message.setDelayTimeLevel(3);
        SendResult send = producer.send(message);
        //打扫战场
        //producer.shutdown();
    }
}

package type;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

//发送消息
public class ProducerOneway {
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
        //单向消息
        producer.sendOneway(message);
        //打扫战场
        //producer.shutdown();
    }
}

package simple;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

//发送消息
public class Producer {
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
        SendResult send = producer.send(message);
        //发的结果是什么？
        System.out.println(send);
        //打扫战场
        producer.shutdown();
    }
}

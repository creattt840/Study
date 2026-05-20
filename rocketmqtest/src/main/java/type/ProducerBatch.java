package type;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.util.ArrayList;

//发送消息
public class ProducerBatch {
    public static void main(String[] args) throws Exception {
        //谁来发？
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        //发给谁？
        producer.setNamesrvAddr("localhost:9876");
        producer.start();

        //批量消息
        ArrayList<Message> msgList = new ArrayList<>();
        String meg="hello world!";
        Message msg1 = new Message("topic4", "tag1", meg.getBytes());
        msgList.add(msg1);
        String meg2="hello world2";
        Message msg2 = new Message("topic4", "tags1", meg2.getBytes());
        msgList.add(msg2);
        String meg3="hello world3";
        Message msg3 = new Message("topic4", "tags1", meg3.getBytes());
        msgList.add(msg3);

        SendResult send = producer.send(msgList);
        System.out.println(send);
        //打扫战场
        //producer.shutdown();
    }
}

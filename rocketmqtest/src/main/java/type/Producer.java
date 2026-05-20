package type;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

//发送消息
public class Producer {
    public static void main(String[] args) throws Exception {
        //谁来发？
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        //发给谁？
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        /*怎么发？
        //发什么？
        String meg="hello world!";
        Message message = new Message("topic1", "tag1", meg.getBytes());
        SendResult send = producer.send(message);
        //发的结果是什么？
        System.out.println(send);*/
        for (int i = 0; i < 10; i++) {
            String meg="hello world!"+i;
            Message message = new Message("topic3", "tag1", meg.getBytes());
            //异步消息
            producer.send(message, new SendCallback() {
                //发送成功的回调方法
                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.println(sendResult);
                }
                //发送失败的回调方法
                @Override
                public void onException(Throwable e) {
                    //业务逻辑
                    System.out.println(e);
                }
            });
        }
        System.out.println("异步发送完成");
        //打扫战场
        //producer.shutdown();
    }
}

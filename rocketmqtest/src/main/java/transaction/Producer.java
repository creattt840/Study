package transaction;

import org.apache.rocketmq.client.producer.*;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

//发送消息
public class Producer {
    public static void main(String[] args) throws Exception {
        //谁来发？
        TransactionMQProducer producer = new TransactionMQProducer("group1");
        //发给谁？
        producer.setNamesrvAddr("localhost:9876");
        //设置事务监听
        producer.setTransactionListener(new TransactionListener() {
            //正常事务过程
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {
                System.out.println("执行了正常的事务过程");
                return LocalTransactionState.COMMIT_MESSAGE;
                //如果失败返回ROLLLBACK
                //return LocalTransactionState.ROLLBACK_MESSAGE;

                //如果未收到确认，则返回unkonw到事务补偿
                //return LocalTransactionState.UNKNOW;
            }

            //事务补充过程
            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
                System.out.println("执行的是事务补充过程");
                //再进行判断然后进行事务提交或者回滚
                //return LocalTransactionState.COMMIT_MESSAGE;
                return LocalTransactionState.ROLLBACK_MESSAGE;
            }
        });

        producer.start();
        String msg="hello world transaction";
        Message message=new Message("topic13","tag1",msg.getBytes());
        //发送事务消息
        TransactionSendResult transactionSendResult = producer.sendMessageInTransaction(message, null);
        System.out.println(transactionSendResult);

        //别关生产者，否则事务流程后续无法操作
    }
}

package udpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
            组播发送端代码
         */

        //创建MulticastSocket对象
        MulticastSocket ms=new MulticastSocket();

        //创建DatagramPacket对象
        String s="hello world";
        byte[] by=s.getBytes();
        InetAddress adress=InetAddress.getByName("224.0.0.1");
        DatagramPacket dp=new DatagramPacket(by,by.length,adress,10086);

        //调用MulticastSocket发送数据方法发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}

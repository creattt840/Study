package udpDemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //接收数据

        //1.创建DatagramSocket对象
        //细节：
        //在接收的时候，一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        DatagramSocket ds=new DatagramSocket(10086);

        //2.数据打包
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        //该方法是阻塞的
        //程序执行到这一步的时候，会在这里死等
        //等发送端发送消息
        ds.receive(dp);

        //3.解析数据包
        byte[] data=dp.getData();
        int len=dp.getLength();
        InetAddress adress=dp.getAddress();
        int port=dp.getPort();
        System.out.println("发送端的IP地址："+adress.getHostAddress());
        System.out.println("发送端的端口号："+port);
        System.out.println("发送端发送的消息："+new String(data,0,len));
    }
}

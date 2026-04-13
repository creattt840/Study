package udpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
            组播接收端代码
         */

        //1.创建MulticastSocket对象
        MulticastSocket ms=new MulticastSocket(10086);

        //2.将当前本机，添加到224.0.0.1的这一组当中
        InetAddress adress=InetAddress.getByName("224.0.0.1");
        ms.joinGroup(adress);

        //3.创建DatagramPacket数据包对象
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        //4.接收数据
        ms.receive(dp);

        //5.解析数据
        byte[] bytes1=dp.getData();
        int len=dp.getLength();
        String ip=dp.getAddress().getHostAddress();
        String name=dp.getAddress().getHostName();

        System.out.println("ip="+ip);
        System.out.println("name="+name);
        System.out.println("len="+len);
        System.out.println("bytes1="+new String(bytes1,0,len));

        //6.释放资源
        ms.close();
    }
}

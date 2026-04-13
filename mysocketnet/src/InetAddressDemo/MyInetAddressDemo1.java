package InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
            static InetAddress getByName(String host) 确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
            String getHostName() 获取此IP地址的主机名
            String getHostAddress() 返回文本显示的IP地址字符串
         */

        //1.获取InetAddress的对象
        InetAddress address=InetAddress.getByName("127.0.0.1");
        System.out.println(address);

        //2.获取主机名
        String hostName=address.getHostName();
        System.out.println(hostName);

        //3.获取IP地址
        String hostAddress=address.getHostAddress();
        System.out.println(hostAddress);
    }
}

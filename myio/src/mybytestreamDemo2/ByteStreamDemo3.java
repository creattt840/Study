package mybytestreamDemo2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            public int read(byte[] buffer) 一次读一个字节数组数据
         */

        //1.创建对象
        FileInputStream fis=new FileInputStream("mybytestreamDemo2\\a.txt");
        //2.读取数据
        byte[] bytes=new byte[2];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到了多少个字节数据
        int len=fis.read(bytes);
        System.out.println(len);//2
        String str=new String(bytes,0,len);//将字节数组转换为字符串
        System.out.println(str);//ab
    }
}

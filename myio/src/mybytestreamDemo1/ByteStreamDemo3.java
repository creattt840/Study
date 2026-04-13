package mybytestreamDemo1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b) 一次写一个字节数据
            void write(byte[] b) 一次写一个字节数组数据
            void write(byte[] b,int off,int len) 一次写一个字节数组的部分数据
            参数一：
                数组
            参数二：
                起始索引
            参数三：
                个数
         */

        //创建对象
        FileOutputStream fos=new FileOutputStream("mybytestreamDemo1\\fos.txt");
        //2.写出数据
        fos.write(97);
        fos.write(98);

        byte[] bytes={'a','b','c','d','e'};
        fos.write(bytes);

        fos.write(bytes,1,3);//b,c,d

        //3.释放资源
        fos.close();
    }
}

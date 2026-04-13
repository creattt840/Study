package mybytestreamDemo2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            演示：字节输入流FileInputStream
            实现需求：读取文件中的数据

            实现步骤：
                创建对象
                读取数据
                释放资源
         */

         //1.创建对象
        FileInputStream fis=new FileInputStream("fos.txt");
        //2.读取数据
        int read=fis.read();
        System.out.println((char)read);
        //3.释放资源
        fis.close();
    }
}

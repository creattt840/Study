package myconvertstreamDemo1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
         */

        //1.创建转换流的对象
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("myio\\src\\myconvertstreamDemo1\\ConvertStreamDemo2.java"),"GBK");
        //2.写出数据
        osw.write("你好中国");
        //3.释放资源
        osw.close();

        //优化方法
        //1.创建转换流的对象
        FileWriter fw=new FileWriter("myio\\src\\myconvertstreamDemo1\\ConvertStreamDemo2.java", Charset.forName("GBK"));
        //2.写出数据
        fw.write("你好中国");
        //3.释放资源
        fw.close();
    }
}

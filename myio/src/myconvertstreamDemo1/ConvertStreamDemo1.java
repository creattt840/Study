package myconvertstreamDemo1;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码读取

         */

        //因为JDK11:这种方式被淘汰了
        //1.创建对象并指定字符编码
        InputStreamReader isr=new InputStreamReader(new FileInputStream("myio\\src\\myconvertstreamDemo1\\ConvertStreamDemo1.java"),"GBK");
        //2.读取数据
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        //3.释放资源
        isr.close();

        //优化方法
        //1.创建对象并指定字符编码
        FileReader fr=new FileReader("myio\\src\\myconvertstreamDemo1\\ConvertStreamDemo1.java", Charset.forName("GBK"));
        //2.读取数据
        int ch2;
        while((ch2=fr.read())!=-1){
            System.out.print((char)ch2);
        }
        //3.释放资源
        fr.close();
    }
}

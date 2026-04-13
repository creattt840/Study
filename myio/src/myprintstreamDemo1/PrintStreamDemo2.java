package myprintstreamDemo1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            字符打印流：
                构造方法：
                    public PrintWriter(Write/File/String) 关联字节输出流/文件/文件路径
                    public PrintWriter(String fileName,Charset charset) 指定字符编码
                    public PrintWriter(Writer w, boolean autoFlush) 自动刷新
                    public PrintWriter(Writer w, boolean autoFlush, String charsetName) 自动刷新，指定字符编码
                成员方法：
                    public void write(int b) 常规方法：规则跟之前一样，将指定的字节写出
                    public void println(Xxx xxx) 特有方法：打印任意数据，自动刷新，自动换行
                    public void print(Xxx xxx) 特有方法：打印任意数据，自动刷新，不换行
                    public void printf(String format,Object...args) 特有方法：带占位符的打印语句，不换行
         */

        //1.创建字符打印流的对象
        PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);

        //2.写出数据
        pw.println(97);//写出+自动刷新+自动换行
        pw.print(true);
        pw.printf("我是%s,我今年%d岁","张三",18);

        //3.关闭流
        pw.close();
    }
}

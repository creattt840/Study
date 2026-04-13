package mycharstreamDemo3;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            public void flush() 将缓冲区中的数据，刷新到本地文件中
         */

        FileWriter fw=new FileWriter("mycharstreamDemo3\\CharStreamDemo2.java");

        fw.write("hello world");

        fw.flush();

        fw.write("goodd!");

        fw.close();

        fw.write("hellooo!");
    }
}

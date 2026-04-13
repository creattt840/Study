package mybytestreamDemo2;

import java.io.FileReader;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) throws IOException {
        /*
            有参的读取数据
            public int read(char[] buffer) 读取多个数据，读到末尾返回-1
         */

        //1.创建对象
        FileReader fr=new FileReader("mybytestreamDemo2\\ByteStreamDemo8.java");
        //2.读取数据
        char[] chars=new char[2];
        int len;
        //read(chars)：读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
        //空参的read+强转类型转换
        while((len=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }

        //3.释放资源
        fr.close();
    }
}

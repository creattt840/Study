package mybytestreamDemo2;

import java.util.Arrays;

public class ByteStreamDemo6 {
    public static void main(String[] args) {
        /*
            Java中编码的方法
                public byte[] getBytes() 使用默认方式进行编码
                public byte[] getBytes(String charseName) 使用指定方式进行编码

            Java中解码的方法
                String(byte[] bytes) 使用默认方式进行解码
                String(byte[] bytes,String charseName) 使用指定方式进行解码
         */

        //1.编码
        String str="中国";
        byte[] bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));

        //2.解码
        String str2=new String(bytes);
        System.out.println(str2);
    }
}

package myfileDemo1;

import java.io.File;

public class MyfileDemo6 {
    public static void main(String[] args) {
        /*
            public File[] listFiles() 获取当前路径下所有的内容
         */

        //1.创建File对象
        File f1=new File("E:\\代码\\File");
        //listFiles方法
        //作用：获取File文件夹里面的所有内容，把所有的内容收到数组中返回
        File[] files=f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}

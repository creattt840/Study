package myfileDemo1;

import java.io.File;

public class MyfileDemo3 {
    public static void main(String[] args) {
        /*
            public long length() 返回文件的大小（字节数量）
            public String getAbsolutePath() 返回文件的绝对路径
            public String getPath() 返回定义文件时使用的路径
            public String getString() 返回文件的名称，带后缀
            public long lastModified() 返回文件的最后修改时间（毫秒值）
         */

        //1.length 返回文件的大小（字节数）
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位我们要的是M,G,可以不断的除以1024
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起
        File f1=new File("E:\\代码\\File\\a.txt");
        System.out.println(f1.length());//13

        File f2=new File("E:\\代码\\File\\aaa");
        System.out.println(f2.length());//0

        //2.getAbsolutePath 返回文件的绝对路径
        System.out.println(f1.getAbsolutePath());//E:\代码\File\a.txt

        //3.getPath 返回定义文件时使用的路径
        System.out.println(f1.getPath());//E:\代码\File\a.txt

        //4.getName 返回文件的名称，带后缀
        //细节1：
        //a.txt:
        //      a 文件名
        //      txt后缀名，扩展名
        //细节2：
        //文件夹：返回的就是文件夹的名字
        File f3=new File("E:\\代码\\File\\a.txt");
        System.out.println(f3.getName());//a.txt
        File f4=new File("E:\\代码\\File\\aaa");
        System.out.println(f4.getName());//aaa

        //5.lastModified 返回文件的最后修改时间（毫秒值）
        System.out.println(f1.lastModified());//1692220800000
    }
}

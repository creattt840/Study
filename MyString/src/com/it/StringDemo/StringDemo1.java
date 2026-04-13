package com.it.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式创建字符串对象
        //直接赋值的方式创建字符串对象，会先检查字符串常量池是否有该字符串
        //如果有，就不会再创建新的字符串对象，而是直接返回该字符串对象的地址
        //如果没有，就会在字符串常量池当中创建一个新的字符串对象
        String s1="hello";
        System.out.println(s1);

        //2.使用new关键字创建字符串对象
        //空参构造
        String s2=new String();
        System.out.println("@"+s2+"!");

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3=new String("hello");
        System.out.println(s3);

        //传递一个字符数组，根据传递的字符数组内容再创建一个新的字符串对象
        char[] chs={'a','b','c'};
        String s4=new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据传递的字节数组内容再创建一个新的字符串对象
        //应用场景：以后在网络当中传输的数据其实都是字节信息
        //我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了
        byte[] bytes={97,98,99};//97对应a,98对应b,99对应c
        String s5=new String(bytes);
        System.out.println(s5);//abc
    }
}

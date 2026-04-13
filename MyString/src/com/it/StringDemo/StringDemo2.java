package com.it.StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1=new String("hello");
        String s2="hello";

        //2.==号比较
        //引用数据类型：比较的是地址值是否相同
        System.out.println(s1==s2);//false

        //3.比较字符串内容是否相同
        System.out.println(s1.equals(s2));//true

        //4.忽略大小写比较字符串内容是否相同
        System.out.println(s1.equalsIgnoreCase(s2));//true 
    }
}

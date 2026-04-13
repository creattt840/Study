package com.it.StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();

        //2.反转键盘录入的字符串
        String result=new StringBuilder().append(str).reverse().toString();

        //3.比较
        if(str.equals(result)){
            System.out.println("是回文字符串");
        }else{
            System.out.println("不是回文字符串");
        }
    }
}

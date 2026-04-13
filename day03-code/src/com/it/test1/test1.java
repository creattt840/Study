package com.it.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中个位十位百位

        //1.键盘键入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num=sc.nextInt();

        //2.获取个位十位百位
        //公式：
        //个位：数字%10
        //十位：数字/10%10
        //百位：数字/100%10
        //...
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100%10;
        System.out.println("个位数："+ge);
        System.out.println("十位数："+shi);
        System.out.println("百位数："+bai);
    }
}

package com.it.test1;

import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //需求：程序生成一个1~100之间的随机数，使用程序实现猜这个数字是多少？

        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(100)+1;
        System.out.println("猜这个数字是多少？");
        int a=sc.nextInt();
        while(a!=num){
            if(a>num){
                System.out.println("你猜的数字大了");
                a=sc.nextInt();
            }
            else{
                System.out.println("你猜的数字小了");
                a=sc.nextInt();
            }
        }
        System.out.println("恭喜你猜对了");
    }
}

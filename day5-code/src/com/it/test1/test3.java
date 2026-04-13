package com.it.test1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /**
         * 需求：键盘录入一个正整数x，判断x是否是质数
         * 质数：只能被1和本身整除的数
         */

        int x;
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入一个正整数");
        x=sc.nextInt();
        if(x==1||x==2){
            System.out.println("不是质数");
            return;
        }
        for(a=2;a<x;a++){
            if(x%a==0){
                System.out.println("不是质数");
                break;
            }
        }
        if(a==x){
            System.out.println("是质数");
        }
    }
}

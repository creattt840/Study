package com.it.test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /**
         * 需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
         * 结果只保留整数部分，小数部分将被舍去
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("请录入一个大于等于2的整数");
        int x=sc.nextInt();
        for(int a=1;a<=x;a++){
            if(a*a==x){
                System.out.println("x的平方根为"+a);
                break;
            }else if(a*a>x){
                System.out.println("x的平方根为"+(a-1));
                break;
            }
        }
    }
}

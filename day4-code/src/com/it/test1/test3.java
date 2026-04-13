package com.it.test1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /**
         * 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）
         * 将两个数相除，要求不得使用乘法、除法和取余运算符。
         * 得到商和余数
         * @param args
         */

        //下列代码添加注释
        /**
         * 分析：
         * 1.被除数和除数都是正数，且不超过int的范围
         * 2.不能使用乘法、除法和取余运算符
         * 3.得到商和余数
         */
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入被除数：");
        x=sc.nextInt();
        System.out.println("输入除数：");
        y=sc.nextInt();
        int z=0;
        while(x>=y){
            x=x-y;
            z++;
        }
        System.out.println("商："+z);
        System.out.println("余数："+x);
    }
}

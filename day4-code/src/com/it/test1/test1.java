package com.it.test1;

import java.util.Scanner;

public class test1 {
    /**
     * 需求：给你一个整数x
     * 如果x是一个回文整数，返回true
     * 否则，返回false
     * 回文整数：指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * 例如，121 是回文，而 123 不是。
     * @param args
     */

    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        x=sc.nextInt();
        int original=x;
        int sum=0;
        int temp;
        while(x!=0){
            temp=x%10;
            sum=sum*10+temp;
            x=x/10;
        }
        if(sum==original){
            System.out.println("是回文整数");
        }else{
            System.out.println("不是回文整数");
        }
    }
}

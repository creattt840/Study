package com.it.test1;

public class test5 {
    public static void main(String[] args) {
        /**需求：
         * 定义两个变量，交换两个变量记录的值
         */


        int a=10;
        int b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //交换
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}

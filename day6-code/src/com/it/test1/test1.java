package com.it.test1;

public class test1 {
    public static void main(String[] args) {
        //需求：定义一个方法求长方形的周长，将结果在方法中进行打印
        getPerimeter(10,20);
    }
    public static void getPerimeter(int a,int b){
        int perimeter=(a+b)*2;
        System.out.println("周长为："+perimeter);
    }
}

package com.it.method;

public class methodDemo2 {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义的格式和调用的格式
        getSum(10,20);
    }

    public static void getSum(int a,int b){
        int sum=a+b;
        System.out.println("结果为："+sum);
    }
}

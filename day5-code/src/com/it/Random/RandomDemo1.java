package com.it.Random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //先获得一个随机数
        //范围：0~10

        //1.导包
        //2.创建对象
        Random r=new Random();

        //3.生成随机数
        //在小括号中是生成随机数范围
        //这个范围从0开始
        //到这个数-1结束
        int num=r.nextInt(10);//0~9
        System.out.println("随机数为："+num);
    }
}

package com.it.Random;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        //需求：生成一个1~100之间的随机数

        Random r=new Random();
        int num=r.nextInt(100)+1;
        System.out.println("随机数为："+num);


        //生成一个7~15之间的随机数
        //1.让这个范围头尾都减去一个值，让这个范围从0开始 -7 0~8
        //2.尾巴+1 8+1=9
        //3.最终的结果，再加上第一步减去的值

        int a=r.nextInt(9)+7;//7~15之间的随机数
        System.out.println("随机数为："+a);
    }
}

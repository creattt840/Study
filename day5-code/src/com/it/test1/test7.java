package com.it.test1;

import java.util.Random;

public class test7 {
    public static void main(String[] args) {
        /**需求：
         * 定义一个数组，存入1~5，要求打乱数组中所有数据的顺序。
         */

        int[] arr={1,2,3,4,5};
        int temp;
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            //随机数生成 n~m
            //头尾减去一个值使其从0开始去范围 -n
            //尾部范围+1 m+1
            //最后将m+1写入括号内，括号外面加上第二步减去的值+n
            int Randomint=r.nextInt(arr.length);
            temp=arr[i];
            arr[i]=arr[Randomint];
            arr[Randomint]=temp;
        }
        System.out.println("打乱后的数组为：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

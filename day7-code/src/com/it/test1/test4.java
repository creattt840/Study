package com.it.test1;

public class test4 {
    public static void main(String[] args) {
        /*需求：
        把一个数组中的元素复制到另一个新数组中去
         */

        //分析：
        //1.定义一个老数组并存储一些元素
        int[] arr={1,2,3,4,5,6,7,8,9};
        //2.定义一个新数组的长度跟老数组一致
        int[] newArr=new int[arr.length];
        //3.遍历老数组，把每一个元素赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        //4.打印新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}

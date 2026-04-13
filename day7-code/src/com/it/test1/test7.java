package com.it.test1;

public class test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位添加到数组当中
        //反向推导

        //1.计算数组的长度
        int num=12345;
        //定义一个变量临时记录num值
        int temp=num;
        //定义一个变量进行统计
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }

        //2.定义数组
        //动态初始化
        int[] arr=new int[count];

        //3.把每一位数字添加到数组当中
        int index=arr.length-1;
        while(temp!=0){
            //获取temp里的每一位数组
            int ge=temp%10;
            //再去掉右边的数字
            temp=temp/10;
            //把获取到的每一位数字添加到数组当中
            arr[index]=ge;
            index--;
        }
        //4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

package com.it.ArrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /*定义一个数组，用来存班级中50个学生的姓名
        姓名未知，等学生来报道后，再进行添加。
         */

        //格式：
        //数据类型[] 数组名= new 数据类型[数组长度];

        String[] arr=new String[50];
        //添加学生
        arr[0]="张三";
        arr[1]="李四";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'\u0000' 空格
        //布尔类型：默认初始化值false
        //引用类型：默认初始化值null
    }
}

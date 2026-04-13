package com.it.logicoperatorDemo1;

public class logicoperatorDemo2 {
    public static void main(String[] args) {
        //1.&& 与
        //两边都为真，结果才为真
        System.out.println(true&&true);//true
        System.out.println(true&&false);//false
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false
        //2.|| 或
        //两边有一个为真，结果就为真
        System.out.println(true||true);//true
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(false||false);//false

        //3.短路运算符具有短路效果
        //&& 与
        //如果第一个为假，第二个就不执行了
        System.out.println(false&&(10/0>0));//false
        //|| 或
        //如果第一个为真，第二个就不执行了
        System.out.println(true||(10/0>0));//true
    }
}

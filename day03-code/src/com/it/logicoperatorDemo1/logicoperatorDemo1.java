package com.it.logicoperatorDemo1;

public class logicoperatorDemo1 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都为真，结果才为真
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false
        System.out.println(false&false);//false
        //2.| 或者
        //两边有一个为真，结果就为真
        System.out.println(true|true);//true
        System.out.println(true|false);//true
        System.out.println(false|true);//true
        System.out.println(false|false);//false
        //3.^ 异或
        //两边不同为真，相同为假
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^true);//true
        System.out.println(false^false);//false
        //4.！ 非
        //真变假，假变真
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}

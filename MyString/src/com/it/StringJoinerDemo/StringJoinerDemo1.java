package com.it.StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建StringJoiner对象
        StringJoiner sj=new StringJoiner(",","[","]");

        //2.添加元素
        sj.add("a").add("b").add("c");

        //3.打印
        System.out.println(sj);
    }
}

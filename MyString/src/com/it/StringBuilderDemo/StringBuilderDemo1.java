package com.it.StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        //普及：
        //因为StringBulider是java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。
    }
}

package com.it.switchDemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        int num=1;
        //如果大括号只有一行代码，大括号可以省略
        //如果大括号有多行代码，大括号不能省略
        switch(num){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default ->{
                System.out.println("输入错误");
            }
        }
    }
}

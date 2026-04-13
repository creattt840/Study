package com.it.shiplopp;

public class SkipLoppDemo2 {
    public static void main(String[] args) {
        //2.结束整个循环
        for(int i=0;i<10;i++){
            if(i==5){
                //结束整个循环
                break;
            }
            System.out.println(i);
        }
        System.out.println("循环结束");
    }
}

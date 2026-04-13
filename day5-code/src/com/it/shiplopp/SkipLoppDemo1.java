package com.it.shiplopp;

public class SkipLoppDemo1 {
    public static void main(String[] args) {
        //1.跳过一次循环
        for(int i=0;i<10;i++){
            if(i==5){
                //结束本次循环，继续下次循环
                continue;
            }
            System.out.println(i);
        }
    }
}

package com.it.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格:旺季(5-10月)头等舱9折+经济舱8.5折，
        淡季(11月到来年4月)头等舱7折，经济舱6.5折。*/

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price=sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入舱位：1-头等舱，2-经济舱");
        int type=sc.nextInt();

        if(month>=5&&month<=10){
            if(type==1){
                System.out.println("您的机票价格为："+price*0.9);
            }else if(type==2){
                System.out.println("您的机票价格为："+price*0.85);
            }
        }else if(month>=11||month<=4){
            if(type==1){
                System.out.println("您的机票价格为："+price*0.7);
            }else if(type==2){
                System.out.println("您的机票价格为："+price*0.65);
            }
        }
    }
}

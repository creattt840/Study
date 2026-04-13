package com.it.switchDemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int score=100;
        if(score>=90 && score<=100){
            System.out.println("送自行车");
        }else if(score>=80 && score<90){
            System.out.println("送游乐场");
        }else if(score>=70 && score<80){
            System.out.println("送变形金刚");
        }else if(score>=60 && score<70){
            System.out.println("送飞机");
        }else{
            System.out.println("送火箭");
        }
    }
}

package com.it.test1;

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr=createNumber();

        //打印中奖号码
        System.out.println("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2.让用户输入彩票号码(红球+蓝球)
        int[] userArr=userInputNunber();

        //3.判断用户中奖情况
        //红球 蓝球
        int redCount=0;
        int blueCount=0;
        
        //判断红球
        for (int i = 0; i < userArr.length-1; i++) {
            for(int j=0;j<arr.length-1;j++){
                if(userArr[i]==arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球
        if(userArr[userArr.length-1]==arr[arr.length-1]){
            blueCount++;
        }

        //判断中奖情况
        if(redCount==6 && blueCount==1){
            System.out.println("恭喜您，中奖了10000元");
        }else if(redCount==6 && blueCount==0){
            System.out.println("恭喜您，中奖了588元");
        }else if(redCount==5 && blueCount==1){
            System.out.println("恭喜您，中奖了888元");
        }else if(redCount==5 && blueCount==0){
            System.out.println("恭喜您，中奖了1000元");
        }else if(redCount==4 && blueCount==1){
            System.out.println("恭喜您，中奖了2元");
        }else{
            System.out.println("很遗憾，您没有中奖");
        }
    }

    public static int[] userInputNunber(){
        //1.创建数组用于添加用户购买的彩票号码
        //6个红球 1个蓝球 数组长度：7
        int[] arr=new int[7];

        //2.利用键盘键入
        Scanner sc=new Scanner(System.in);
        //让用户输入红球号
        for (int i = 0; i < 6;) {
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber=sc.nextInt();
            //redNumber 在1~33 唯一不重复
            if(redNumber>=1 &&redNumber<=33){
                arr[i]=redNumber;
                i++;
            }else{
                System.out.println("您输入的红球号码有误，请重新输入");
            }
        }
        //让用户输入蓝球号码
        System.out.println("请输入蓝球号码:");
        int blueNumber=sc.nextInt();
        while(blueNumber<=0 || blueNumber>16){
            System.out.println("您输入的蓝球号码有误，请重新输入");
            blueNumber=sc.nextInt();
        }
        arr[6]=blueNumber;
        return arr;
    }

    public static int[] createNumber(){
        //1.创建数组用于添加中奖号码
        //6个红球 1个蓝球 数组长度：7
        int[] arr=new int[7];

        //2.随机生成号码并添加到数组当中
        //红球：不能重复的 1 2 3 4 5
        //蓝球：可以跟红球号码重复 5

        //生成红球号码并添加到数组当中
        Random r=new Random();
        for (int i = 0; i < 6;) {
         //获得红球号码
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }

        //生成蓝球号码并添加到数组当中
        int blueNumber=r.nextInt(16)+1;
        arr[6]=blueNumber;
        return arr;
    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}

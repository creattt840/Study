package com.it.test1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        // 选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分

        //分析：
        //1.定义一个数组用来存储六位评委的打分（0~100）
        int[] scores=getScore();

        //2.求出数组中的最大值
        int max=getMax(scores);

        //3.求出数组中的最小值
        int min=getMin(scores);

        //4.求数组的总和
        int sum = getSum(scores);
        //5.计算平均分
        int avg=(sum-max-min)/(scores.length-2);
        System.out.println("选手的最终得分是："+avg);

    }

    //求数组的总和
    private static int getSum(int[] scores) {
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+= scores[i];
        }
        return sum;
    }

    //录入六位评委分数
    public static int[] getScore(){
        //定义数组
        int[] scores=new int[6];

        //使用键盘录入形式，输入分数0~100
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入第"+(i+1)+"位评委的打分");
            int score=sc.nextInt();
            if(score>=0&&score<=100){
                scores[i]=score;
                i++;
            }else{
                System.out.println("您输入的分数有误，请输入0~100之间的整数");
            }
        }
        return scores;
    }

    //求数组中的最大值
    public static int getMax(int[] scoreArr){
        int max=scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]>max){
                max=scoreArr[i];
            }
        }
        return max;
    }

    //求数组中的最小值
    public static int getMin(int[] scoreArr){
        int min=scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]<min){
                min=scoreArr[i];
            }
        }
        return min;
    }
}

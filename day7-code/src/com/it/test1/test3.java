package com.it.test1;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /*需求:
         * 定义方法实现随机产生一个5位的验证码
         * 验证码格式:长度为5
         * 前四位是大写字母或者小写字母
         * 最后一位是数字
         */

        //方法：在以后如果要在一堆没有规律的数据中随机抽取
        //可以先把这些数据放到数组当中
        //再随机抽取一个索引

        //分析：
        //1.大写字母和小写字母都放到数组当中
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            //a---97
            if(i<=25){
                chs[i]=(char)('a'+i);
            }else{
                //A---65
                chs[i]=(char)('A'+i-26);
            }
        }
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

        //定义一个字符串类型的变量，用来记录最终的结果
        String result="";
        //2.随机抽取4次
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(chs.length);
            result+=chs[index];
        }
        //3.随机抽取一个数字0~9
        result+=r.nextInt(10);
        System.out.println(result);
    }
}

package com.it.test1;

public class test1 {
    public static void main(String[] args) {
        /**
         * 逢7过
         * 1.1-100之间的数字
         * 2.如果数字是7的倍数，或者数字中包含7，那么就过
         * 3.其他数字正常输出
         */

        //分析：
        //1.1-100之间的数字
        //2.如果数字是7的倍数，或者数字中包含7，那么就过
        //3.其他数字正常输出

        for(int i=1;i<=100;i++){
            if(i%7==0 || i%10==7 || i/10%10==7){
                System.out.println("过");
            }else{
                System.out.println(i);
            }
        }
    }
}

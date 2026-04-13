package com.it.test1;

public class test8 {
    public static void main(String[] args) {
        /*某系统的数字密码(大于0)。比如1983，采用加密方式进行传输，规则如下:
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        按照以上规则进行解密
        比如1983加密之后变成8346，解密之后变成1983
        */

        //1.定义数组记录解密之后的结果
        int[] arr={8,3,4,6};

        //2.反转
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        //3.由于就加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断：0~4之间+10，5~9之间不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=4&&arr[i]>=0){
                arr[i]+=5;
            }else{
                arr[i]-=5;
            }
        }

        //4.把数组中的元素拼接成一个整数
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }
}

package com.it.test1;

public class test6 {
    public static void main(String[] args) {
        /*某系统的数字密码(大于0)。比如1983，采用加密方式进行传输规则如下:
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。*/

        //分析：
        //1.把整数里面的每一位放到数组中
        int[] arr={1,9,8,3};

        //2.加密
        for (int i = 0; i < arr.length; i++) {
            //每位数加5
            arr[i]+=5;
            //再对10求余
            arr[i]%=10;
        }
        //将所有的数字反转
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //3.把数组里面的每一个数字进行拼接，变成加密之后的结果
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }
}

package myfunctionDemo1;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排序
        Integer[] arr={1,2,3,4,5,6,7,8,9};

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用的方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用的方法的功能需要满足当前的要求

        //表示引用FunctionDemo1类里面的subtraction方法
        //把这个方法当作抽象方法的方法体
        Arrays.sort(arr,FunctionDemo1::subtraction);
    }

    //可以是Java已经写好的，也可以是一些第三方的工具类
    public static int subtraction(int a,int b){
        return a-b;
    }
}

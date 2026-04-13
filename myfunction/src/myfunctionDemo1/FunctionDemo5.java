package myfunctionDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo5 {
    public static void main(String[] args) {
        /*
            方法引用(类名引用成员方法)
            格式
                类名：成员方法
            需求：
                集合里面的一些字符串，要求变成大写后进行输出

            抽象方法的形参的详解：
            第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
                      在Stream流中，第一个参数一般都表示流里面的每一个数据
                      假设流里面的数据都是字符串，那么使用这种方式进行引用，只能引用String类中的方法

            第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法是无参的成员方法

            局限性：
                不能引用所有类中的成员方法。
         */

        //1.创建集合对象
        ArrayList<String> list=new ArrayList<>();

        //2.添加元素
        Collections.addAll(list,"a","b","c","d");

        //3.变成大写后输出
        //原本的形参中只有第一个参数为String类型的代表只能引用String类中方法
        //无第二个形参，表示只能调用String类中的无参方法
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}

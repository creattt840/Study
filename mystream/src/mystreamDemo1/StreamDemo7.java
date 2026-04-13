package mystreamDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo7 {
    public static void main(String[] args) {
        /*
            map 转换流中的数据类型
         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周芷若-14","赵敏-13","张强-12","张三丰-11","王芳-10");

        //需求：只获取里面的年龄进行打印
        //String->int

        //第一个类型：流中原本的数据类型
        //第二个类型：要转成之后的类型

        //apply的形参s：依次表示流里面的每一个数据
        //返回值：表示转换之后的数据

        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据就是整数
        list.stream().map( s-> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}

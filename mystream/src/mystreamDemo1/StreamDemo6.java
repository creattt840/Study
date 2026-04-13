package mystreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
            distinct 元素去重，依赖(hashcode方法和equals方法)
            concat 合并a和b两个流为一个流
         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","王芳");

        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"王芳","张强","赵敏","周芷若","张无忌");

        //distinct 元素去重
        list.stream().distinct().forEach(s-> System.out.println(s));

        //concat 合并a和b两个流为一个流
        Stream.concat(list.stream(),list2.stream()).forEach(s-> System.out.println(s));
    }
}

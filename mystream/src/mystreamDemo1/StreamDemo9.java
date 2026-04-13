package mystreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
            collection(Collection collector) 收集流中的数据，放到集合中（List Set Map）

            注意点：
                如果我们要收集Map集合当中，键不能重复，否则会报错
         */
        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-16");;


        //收集到List集合中
        //需求：
        //我要把所有的男性收集起来
        List<String> newList1=list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        System.out.println(newList1);

        //收集到Set集合中
        //需求：
        //我要把所有男性收起来
        Set<String> newlist2=list.stream()
                .filter(s->s.split("-")[1].equals("男"))
                .collect(Collectors.toSet());
        System.out.println(newlist2);

        //收集Map集合当中
        //谁做为键，谁做为值
        //要把所有的男性收集起来
        //键：姓名。 值：年龄

        list.stream()
                .filter(s->s.split("-")[1].equals("男"))
                /*
                    toMap：参数一表示键的生成规则
                           参数二表示值的生成规则

                    参数一：
                        Function泛型一：表示流中每一个数据的类型
                                泛型二：表示Map集合中键的数据类型
                        方法apply形参：依次表示流里每一个数据
                                方法体：生成键的代码
                                返回值：已经生成的键

                     参数二：
                        Function泛型一：表示流中每一个数据的类型
                                泛型二：表示Map集合中值的数据类型
                        方法apply形参：依次表示流里每一个数据
                                方法体：生成值的代码
                                返回值：已经生成的值
                 */
                .collect(Collectors.toMap(
                        s-> s.split("-")[0],
                        s->Integer.parseInt(s.split("-")[2])
                )).forEach((k,v)-> System.out.println(k+"="+v));
    }
}

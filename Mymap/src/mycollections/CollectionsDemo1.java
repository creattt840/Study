package mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
            public static <T> boolean addAll(Collection<T> c,T...element) 批量添加元素
            public static void shuffle(List<?> list) 打乱list集合元素的顺序
         */

        //addAll 批量添加元素
        //1.创建集合对象
        ArrayList<String> list=new ArrayList<>();
        //2.批量添加元素
        Collections.addAll(list,"avc","asd");
        //3.打印集合
        System.out.println(list);

        //shuffle打乱
        Collections.shuffle(list);

        System.out.println(list);
    }
}

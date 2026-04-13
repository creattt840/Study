package MycollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /*
            迭代器的细节注意点：
                1.报错NoSuchElementException
                2.迭代器遍历完毕，指针不会复位
                3.循环中只能用一次next方法
                4.迭代器遍历时，不能用集合的方法进行增加或删除
                    如果我们要删除，那么可以用迭代器提供的remove方法进行删除
         */

        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");

        //2.获取迭代器对象
        //迭代器好比一个箭头，默认指向集合的0索引
        Iterator<String> it=coll.iterator();
        //3.利用循环不断去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事：获取元素，并移动指针
            System.out.println(it.next());
        }
    }
}

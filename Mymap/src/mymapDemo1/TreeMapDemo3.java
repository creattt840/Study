package mymapDemo1;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*
            1.TreeMap添加元素的时候，键是否需要重写hashCode和equals方法？
              此时不需要重写，因为TreeMap集合的键是按照自然排序或者比较器排序的，而不是按照哈希值排序的。

            2.HashMap是哈希表结构的，JDK8开始由数组，链表，红黑树组成的
              既然有红黑树，HashMap的键是否需要实现Comparable接口或者传递比较器对象呢？
              不需要，因为在HashMap底层，默认是利用哈希值的大小来创建红黑树的

            3.TreeMap和HashMap谁的效率更高？
              如果是最坏的情况，添加了8个元素，组成了链表，此时TreeMap的效率更高
              一般情况下还是HashMap的效率更高

            4.你觉得在Map集合中，java会提供一个如果键重复了，不会覆盖的put方法呢？
            此时putIfAbsent本身不重要
            传递一个思想：
                代码中的逻辑都有两面性，如果我们只知道了A面，而且代码中还发现了有变量可以控制两面性
                那么该逻辑一定还会有B面

                习惯：
                    boolean类型的变量控制，一半只有AB两面，因为boolean只有两个值
                    int类型的变量控制，一般至少有三面，因为int可以取多个值

             5.三种双列集合，以后如何选择？
                HashMap LinkedHashMap TreeMap

                默认:HashMap
                如果要保证存取有序:LinkedHashMap
                如果要排序:TreeMap
         */
    }
}

package mymapDemo1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        /*
            V put(K key,V value) 添加元素
            V remove(Object key) 根据键删除键值对元素
            void clear() 移除所有的键值对
            boolean containsKey(Object key) 判断集合中是否包含指定键
            boolean containsValue(Object value) 判断集合是否包含指定的值
            boolean isEmpty() 判断集合是否为空
            int size() 集合的长度，也就是集合中键值对的个数
         */

        //1.创建Map集合的对象
        Map<String,String> m=new HashMap<>();

        //2.添加元素
        //put方法的细节：
        //添加/覆盖

        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合中,方法返回null
        //在添加数据的时候，如果键存在，那么会把原有的键值对对象覆盖，会返回被覆盖的键值对对象
        m.put("zhangsan","23");
        m.put("lisi","24");
        m.put("wangwu","25");

        String value=m.put("zhangsan","26");
        System.out.println(value);

        //删除
        String result=m.remove("zhangsan");
        System.out.println(result);

        //清空
        m.clear();

        //判断是否包含
        System.out.println(m.containsKey("lisi"));

        //集合的长度
        System.out.println(m.size());


        //3.打印集合
        System.out.println(m);
    }
}

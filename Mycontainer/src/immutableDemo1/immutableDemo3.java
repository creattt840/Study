package immutableDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class immutableDemo3 {
    public static void main(String[] args) {
        /*
            创建Map集合的不可变集合，键值对的数量超过10个
         */

        //1.创建一个普通的Map集合
        HashMap<String,String> hm=new HashMap<>();
        hm.put("张三","123");
        hm.put("李四","456");
        hm.put("王五","789");
        hm.put("赵六","012");
        hm.put("钱七","345");
        hm.put("孙八","678");
        hm.put("周九","901");
        hm.put("吴十","234");
        hm.put("郑十一","567");
        hm.put("王十二","890");
        hm.put("冯十三","123");

        //2.利用上面的数据来获取一个不可变的集合

        //获取到所有的键值对对象(Entry对象)
        //Set<Map.Entry<String,String>> entries=hm.entrySet();
        //把entries变成一个数组
        //因为可变参数就是一个数组
        //Map.Entry[] arr1=new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度>数组的长度，数据在数组中放不下，此时会根据实际的个数，重新创建数组
        //如果集合的长度<数组的长度，数据在数组中放得下，此时不会创建新的数组，而是直接用
        //Map.Entry[] arr2=entries.toArray(arr1);
        //不可变的map集合
        //Map map=Map.ofEntries(arr2);

        Map map=Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        Set<String> keys=map.keySet();
        for (String key : keys) {
            System.out.println(key+"="+map.get(key));
        }

        //还有一种用普通的Map集合创建不可变Map集合的方法（jdk10以后才能用）
        Map<String,String> maps=Map.copyOf(hm);

    }
}

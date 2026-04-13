package mymapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map=new HashMap<>();

        //2.添加元素
        //键：人物的外号
        //值：人物的名字
        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个set集合
        Set<Map.Entry<String,String>> entries=map.entrySet();
        //3.2遍历entries集合，得到里面每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3利用entry调用get方法获取键和值
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}

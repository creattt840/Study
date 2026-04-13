package immutableDemo1;

import java.util.Map;
import java.util.Set;

public class immutableDemo2 {
    public static void main(String[] args) {
        /*
            创建Map的不可变集合
                细节1：
                    键是不能重复的
                细节2：
                    Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
         */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String,String> map=Map.of("张三","123","李四","456","王五","789");

        Set<String> keys=map.keySet();
        for (String key : keys) {
            String value=map.get(key);
            System.out.println(key+"="+value);
        }

        Set<Map.Entry<String,String>> entries=map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}

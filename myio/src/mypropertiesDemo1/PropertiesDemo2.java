package mypropertiesDemo1;

import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            Properties跟IO流结合的操作
         */

        //1.创建集合
        Properties prop=new Properties();

        //2.添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");

        //3.把集合中的数据以键值对的形式写到本地文件当中
        //FileOutputStream fos=new FileOutputStream("myio\\a.properties");
        //prop.store(fos,null);
        //fos.close();

        //4.把本地文件中的数据加载到集合中
        //FileInputStream fis=new FileInputStream("myio\\a.properties");
        //prop.load(fis);
        //fis.close();
    }
}

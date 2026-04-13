package myfileDemo1;

import java.io.File;

public class MyfileDemo5 {
    public static void main(String[] args) {
        /*
            public boolean delete() 删除文件，空文件夹
            细节：
                如果删除的是文件，则直接删除，不走回收站
                如果删除的是空格文件夹，正则直接删除，不走回收站
                如果删除的是有内容的文件夹，则删除失败
         */

        //1.创建File对象
        File f1=new File("E:\\代码\\File\\b.txt");
        //2.删除文件
        boolean b=f1.delete();
        System.out.println(b);//true
    }
}

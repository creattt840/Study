package mytestDemo1;

import java.io.*;

public class  test01 {
    public static void main(String[] args) throws IOException {
        /*
            拷贝一个文件夹，考虑子文件夹
         */

        //1.创建对象表示要拷贝的对象
        File src=new File("E:\\代码\\basic code\\myio\\src\\mytestDemo1");
        //2.创建对象表示要拷贝到的目的地
        File dest=new File("E:\\代码\\basic code\\myio\\src\\mytestDemo1_copy");

        //3.调用方法开始拷贝
        copydir(src,dest);
    }

    /*
        作用：拷贝文件夹
        参数一：数据源
        参数二：目的地
     */
    private static void copydir(File src,File dest) throws IOException {
        //如果dest不存在就先创建
        dest.mkdirs();
        //递归
        //1.进入数据源
        File[] files=src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                //3.判断文件，拷贝
                FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                FileInputStream fis=new FileInputStream(file);
                byte[] bytes=new byte[1024];
                int len;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fis.close();
                fos.close();
            }else{
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}

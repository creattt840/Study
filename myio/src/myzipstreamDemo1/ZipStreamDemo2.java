package myzipstreamDemo1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            压缩单个文件
         */


        //1.创建File对象表示要压缩的文件
        File src=new File("E:\\代码\\File\\a.txt");
        //2.创建File对象表示压缩包的位置
        File dest=new File("E:\\代码\\File");
        //3.调用方法来压缩
        toZip(src,dest);
    }

    //定义一个方法来压缩
    public static void toZip(File src,File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //2.创建ZipEntry对象表示要压缩的文件
        ZipEntry entry=new ZipEntry("a.txt");
        //3.把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        //4.把src文件中的数据写到压缩包当中
        FileInputStream fis=new FileInputStream(src);
        int len;
        while((len=fis.read())!=-1){
            zos.write(len);
        }
        zos.closeEntry();
        zos.close();
        fis.close();
    }
}

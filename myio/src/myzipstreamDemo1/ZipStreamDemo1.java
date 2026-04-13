package myzipstreamDemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //1.创建一个File表示要解压的压缩包
        File src=new File("E:\\代码\\File\\aaa.zip");
        //2.创建一个File表示要解压的位置
        File dest=new File("E:\\代码\\File");
        unzip(src,dest);
    }

    //定义一个方法来解压
    public static void unzip(File src,File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或文件夹读出来，按照层级拷贝到目的地当中

        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zis=new ZipInputStream(new FileInputStream(src));
        //要先获取到压缩包里面的每一个zipentry对象
        ZipEntry entry;
        while((entry=zis.getNextEntry())!=null){
            if(entry.isDirectory()){
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else{
                //文件：需要读取压缩包中的文件，并把他存放到目的地dest文件夹中
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中一个文件处理完成了
                zis.closeEntry();
            }
        }
        zis.close();
    }
}

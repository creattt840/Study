package threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            多线程的第三章实现方式：
                特点：可以获取到多线程运行的结果

                1.创建一个类Mycallable实现Callale接口
                2.重写cal(有返回值，表示多线程运行的结果)
                3.创建Mycallable对象(表示多线程要执行的任务)
                4.创建FutureTask的对象(作用管理多线程运行的结果)
                5.创建Thread类的对象，并启动(表示线程)
         */

        //创建Mycallable的对象(表示多线程要执行的任务)
        Mycallable mc=new Mycallable();
        //创建FutureTask的对象(作用管理多线程运行的结果)
        FutureTask<Integer> ft=new FutureTask<>(mc);
        //创建Thread的对象(表示线程)
        Thread t=new Thread(ft);
        //启动线程
        t.start();

        //获取多线程运行的结果
        Integer result=ft.get();
        System.out.println(result);
    }
}

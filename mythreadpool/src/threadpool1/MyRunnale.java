package threadpool1;

public class MyRunnale implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}

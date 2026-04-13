package threadcase2;

public class Mythread implements Runnable{

    @Override
    public void run() {
        Thread t1=Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"我是线程");
        }
    }
}

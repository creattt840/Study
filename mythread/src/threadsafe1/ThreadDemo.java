package threadsafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            需求；
                电影院共有100张票，而它有三个窗口
                利用同步方法完成
                技巧：同步代码块
         */

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

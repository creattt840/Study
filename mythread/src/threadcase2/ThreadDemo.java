package threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            多线程的第二种启动方式：
                1.自己定义一个类实现Runnable接口
                2.重写里面的run方法
                3.创建自己的类的对象
                4.创建一个Thread类对象，并开启线程
         */

        //创建Mythread的对象
        //表示多线程要指向的任务
        Mythread mythread=new Mythread();

        //创建线程对象
        Thread thread=new Thread(mythread);
        Thread thread1=new Thread(mythread);

        //给线程设置名字
        thread.setName("线程一");
        thread1.setName("线程二");

        //开启线程
        thread.start();
        thread1.start();
    }
}

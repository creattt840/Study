package threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            多线程的第一种启动方式：
                1.自己定义一个类继承Thread
                2.重写run方法
                3.创建子类的对象，并启动线程
         */

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

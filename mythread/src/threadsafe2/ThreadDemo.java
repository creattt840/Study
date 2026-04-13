package threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            需求：
                电影院共100张票，而它有三个窗口
                用JDK5的lock实现
         */

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        Mythread t3=new Mythread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

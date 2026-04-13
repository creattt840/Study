package threadcase1;

public class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"我是线程");
        }
    }
}

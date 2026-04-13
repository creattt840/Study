package waitandnotify1;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //不断从阻塞队列当中取面条
            try {
                String noodle = queue.take();
                System.out.println("消费者取到了"+noodle);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package waitandnotify1;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    ArrayBlockingQueue<String> queue;


    @Override
    public void run() {
        while(true){
            //不断把面条放到阻塞队列当中
            try {
                queue.put("面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

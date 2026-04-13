package waitandnotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if(Desk.count==0){
                    break;
                }else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();//有面条，等待消费者吃
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //没有面条，生产面条
                        System.out.println("厨师做了一碗面");
                        //修改桌子的状态
                        Desk.foodFlag = 1;
                        //生产之后唤醒消费者
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}

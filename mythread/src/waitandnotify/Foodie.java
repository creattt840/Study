package waitandnotify;

public class Foodie extends Thread{
    /*
        1.循环
        2.同步代码块
        3.判断共享数据是否到了末尾
     */

    @Override
    public void run(){
        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();//没有面条，等待生产者生产
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        //把吃的总数-1
                        Desk.count--;
                        //如果有就吃
                        System.out.println("吃货正在吃面，还能吃"+Desk.count+"碗");
                        //吃完之后唤醒生产者
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}

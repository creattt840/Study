package DateDemo1;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        /*
            public Date()  创建Date对象，表示当前时间
            public Date(long date)  创建Date对象，表示指定时间

            public void setTime(long time)  设置/修改毫秒值
            public long getTime()  获取时间对象的毫秒值
         */

        //1.创建对象表示一个时间
        Date date=new Date();
        System.out.println(date);

        //2.创建对象表示一个指定时间
        Date date1=new Date(0L);
        System.out.println(date1);

        //3.setTime 修改时间
        //1000毫秒=1秒
        date1.setTime(1000L);
        System.out.println(date1);

        //4.getTime 获取时间对象的毫秒值
        System.out.println(date1.getTime());
    }
}

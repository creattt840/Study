package DateDemo1;

public class ZoneDateTimeDemo1 {
    public static void main(String[] args) {
        /*
            static ZoneDateTime now() 获取当前时间的ZoneDateTime对象
            static ZoneDateTime ofXxxx(...) 获取指定时间的ZoneDateTime对象
            ZoneDateTime withXxx(时间) 修改时间系列的方法
            ZoneDateTime minusXxx(时间) 减少时间系列的方法
            ZoneDateTime plusXxx(时间) 增加时间系列的方法
         */

        //细节：
        //JDK8新增的时间对象都是不可变的
        //如果我们修改列，减少了，增加了时间
        //那么调用者是不会发生改变的，产生一个新的时间
    }
}

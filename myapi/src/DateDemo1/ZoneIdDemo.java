package DateDemo1;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        /*
            static Set<String> getAvailableZoneIds() 获取Java中支持的所有时区
            static ZoneId systemDefault() 获取系统默认时区
            static ZoneId of(String ZoneId) 获取一个指定时区
         */

        //1.获取所有的时区名称
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //2.获取当前系统的默认时区
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        //3.获取一个指定时区
        ZoneId zoneId1=ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);

    }
}

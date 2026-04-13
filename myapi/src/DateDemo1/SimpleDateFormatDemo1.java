package DateDemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
            public SimpleDateFormat()  默认格式
            public SimpleDateFormat(String pattern)  自定义格式

            public final String format(Date date)  格式化(日期对象->字符串)
            public Date parse(String source)  解析(字符串->日期对象)
         */

        //1.利用空参构造创建SimpleDateFormat对象
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d1=new Date(0L);
        String str=sdf.format(d1);
        System.out.println(str);//1970-01-01 上午08:00

        //2.利用带参数构造创建SimpleDateFormat对象
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        String str1=sdf1.format(d1);
        System.out.println(str1);//1970年01月01 08:00:00

        //解析：
        //1.定义一个字符串表示时间
        String str2="1970年01月01 08:00:00";
        //2.利用空参构造创建SimpleDateFormat对象
        //细节：
        //创建对象的格式要跟字符串的格式完全一致
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        Date d2=sdf2.parse(str2);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970
    }
}

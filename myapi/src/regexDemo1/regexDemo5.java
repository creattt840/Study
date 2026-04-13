package regexDemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo5 {
    public static void main(String[] args) {
        /*
            只写+和*表示贪婪匹配
            +? 非贪婪匹配
            *? 非贪婪匹配

            贪婪爬取：在爬取数据的时候尽可能的多获取数据
            非贪婪爬取：在爬取数据的时候尽可能的少获取数据

            ab+:
            贪婪爬取：abbbbbbbb
            非贪婪爬取：ab

            Java当中，默认就是贪婪爬取
            如果我们在数量词+ * 后面加上?，就表示非贪婪爬取
         */

        String s="abbbbbbbbaaaaaaaaaaaaaa";

        String regex="ab+?";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

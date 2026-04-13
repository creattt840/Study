package regexDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo3 {
    public static void main(String[] args) throws IOException {
        /* 扩展需求2：
            把连接：https://www.mytxly.com/sfz/
            中所有的身份证号都爬出来
         */

        //创建一个URL对象
        URL url=new URL("https://www.mytxly.com/sfz/");
        //连接上这个网址
        //细节：保持网络是畅通的
        URLConnection conn=url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex="[1-9]\\d{17};";
        Pattern pattern=Pattern.compile(regex);
        //在读取时候每次读取一整行
        while((line=br.readLine())!=null){
            //System.out.println(line);
            Matcher matcher=pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}

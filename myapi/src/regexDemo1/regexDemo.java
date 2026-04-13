package regexDemo1;

public class regexDemo {
    public static void main(String[] args) {
        // \ 转义字符 改变后面那个字符原本的含义
        //练习：以字符串的形式打印一个双引号
        //" 在Java中表示字符串的开头或结尾

        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号而已
        System.out.println("\"");

        // \表示转义字符
        // \\前面的\是一个转义字符，改变了后面\原本的含义，把他变成了一个普普通通的\而已


        //数量词
        //x?  x,一次或0次
        //x*  x,0次或多次
        //x+  x,1次或多次
        //x{n}  x,恰好n次
        //x{n,}  x,至少n次
        //x{n,m}  x,至少n次，最多m次

        //(?i) 忽略后面的大小写


    }
}

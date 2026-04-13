package regexDemo1;

public class regexDemo4 {
    public static void main(String[] args) {
        //1.定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        String regex="Java(?=8|11|17)";

        //?: 表示获取所有的内容
        //?! 表示获取不包含后面内容的所有串
    }
}

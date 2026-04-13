package mystreamDemo1;

import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {
        //数组  public static <T> Stream<T> stream(T[] array) Arrays工具类的静态方法

        //1.创建数组
        int[] arr={1,2,3,4,5,6,7};

        //获取Stream流
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}

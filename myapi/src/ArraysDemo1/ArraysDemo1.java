package ArraysDemo1;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        /*
            public static String toString(数组) 把数组拼接成一个字符串
            public static int binarySearch(数组,要查找的元素) 二分查找法查找元素
            public static int[] copyOf(数组,新数组的长度) 拷贝数组
            public static int[] copyOfRange(原数组，起始索引，结束索引) 拷贝数组（指定范围）
            public static void fill(数组,要填充的元素) 填充数组
             public static void sort(数组) 排序数组
             public static void sort(数组，排序规则) 按照指定的规则排序
         */

        //toString:将数组变成字符串
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //binarySearch:二分查找法查找元素
        //细节一：二分法查找前提：数组中的元素必须是有序的，数组中的元素必须是升序的
        //细节二：如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，那么返回的是-插入点-1
        System.out.println(Arrays.binarySearch(arr, 5));//4
        System.out.println(Arrays.binarySearch(arr, 15));//-11

        //copyOf:拷贝数组
        //参数一：老数组
        //参数二：新数组的长度
        //方法底层会根据第二个参数来创建新的数组
        //如果新数组的长度大于老数组的长度，那么会用0来填充新数组的元素
        //如果新数组的长度小于老数组的长度，那么会截取老数组的元素
        //如果新数组的长度等于老数组的长度，那么会直接拷贝老数组的元素
        int[] newArr=Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(newArr));//[1, 2, 3, 4, 5]

        //copyOfRange:拷贝数组（指定范围）
        //细节：包头不包尾，包左不包右
        int[] newArr2=Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(newArr2));//[3, 4, 5]

        //fill：填充数组
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));//[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        //sort：排序数组。给基本数据类型进行升序排序，底层是快速排序
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}

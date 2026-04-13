package IntegerDemo1;

public class IntegerDemo1 {
    public static void main(String[] args) {
        /*
            public Integer(int value) 根据传递的整数创建一个Integer对象
            public Integer(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueOf(int i) 根据传递的整数创建一个Integer对象
            public static Integer valueOf(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueOf(String s, int radix) 根据传递的字符串和进制数创建一个Integer对象
         */

        //1.利用构造方法获取Integer的对象(JDK5以前的方法)
        //Integer i1=new Integer(1);
        //Integer i2=new Integer("1");

        //2.利用静态方法获取Integer的对象（JDK5以后的方法）
        //Integer i3=Integer.valueOf(1);
        //Integer i4=Integer.valueOf("1");
        //Integer i5=Integer.valueOf("1",2);

        //3.这两种方法获取对象的区别(掌握)
        //对于静态方法valueOf()
        //底层原理：
        //因为在实际开发中，-128~127之间的数据是常用的
        //如果每次都是new对象，那么太浪费内存
        //所以，提前把这个范围之内的每一个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象

        //对于构造方法
        //因为有new关键字，所以每次new都是新创建一个对象
    }
}

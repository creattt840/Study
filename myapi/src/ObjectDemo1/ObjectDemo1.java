package ObjectDemo1;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
            public String toString() 返回对象的字符串表示形式
            public Boolean equals(Object obj) 比较两个对象是否相等
            public Object clone(int a) 对象克隆
         */

        //1.toString 返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        //细节：
        //System:类名
        //out:静态变量
        //System.out:获取打印的对象
        //println():方法
        //参数：表示打印的内容


        //toString方法的结论：
        //如果我们打印一个对象，想要看到属性值，我们可以重写toString方法
        //在重写的方法中，把对象的属性值进行拼接。
    }
}

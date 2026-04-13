package ObjectDemo1;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(s.equals(sb));//false
        //因为equals方法是被s调用的，而s是字符串
        //所以equals要看String类中的
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部的属性
        //但如果参数不是字符串，直接返回false

        System.out.println(sb.equals(s));//false
        //因为equals方法是被sb调用的,而sb是StringBuilder类的对象
        //所以这里的equals方法要看StringBuilder类中的equals方法
        //那么再StringBuilder当中，没有重写equals方法
        //使用的是Object类中的equals方法
        //Object类中的equals方法，比较的是地址值
        //所以这里的结果是false
    }
}

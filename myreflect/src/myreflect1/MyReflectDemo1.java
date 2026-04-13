package myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            获取Class对象的三种方法：
                1.Class.forName("全类名");
                2.类名.class;
                3.对象.getClass();
         */

        //1.第一种方式
        //全类名：包名+类名
        //最为常用
        Class<?> aClass = Class.forName("myreflect1.Student");

        //2.第二种方法
        //一般更多的是当做参数进行传递
        Class studentClass = Student.class;

        //3.第三种方式
        //当我们已经有了这个类的对象时，才可以使用。
        Student s=new Student();
        Class aClass1 = s.getClass();

    }
}

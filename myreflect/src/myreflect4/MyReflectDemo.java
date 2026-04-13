package myreflect4;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            Class类中用于获取成员方法的方法
                Method[] getMethods() 返回所有公共成员方法
                Method[] getDeclaredMethods() 返回所有成员方法，包括私有成员方法
                Method getMethod(String name,Class<?>... parameterTypes) 返回单个公共成员方法
                Method getDeclaredMethod(String name,Class<?>... parameterTypes) 返回单个成员方法，包括私有成员方法

            Method类中用于创建对象的方法
                Object invoke(Object obj,Object... args) 运行方法
                参数一：用obj对象调用该方法
                参数二：调用方法的传递的参数（如果没有就不写）
                返回值：方法的返回值
         */

        //1.获取class字节码文件对象
        Class clazz = Class.forName("myreflect4.Student");

        //2.获取里面所有的方法对象（包含父类中所有的公共方法）
        Method[] mehtods=clazz.getMethods();

        //获取里面所有的方法对象（不能获取父类的，但是可以获取本类中的包含私有方法）
        Method[] methods1=clazz.getDeclaredMethods();

        //获取方法的修饰符
        int modifier=methods1[0].getModifiers();

        //获取方法的名称
        String name=methods1[0].getName();

        //获取方法的形参
        String name1 = methods1[0].getName();

        //获取方法的形参
        Parameter[] parameters = methods1[0].getParameters();

        //获取方法的抛出异常
        Class<?>[] exceptionTypes = methods1[0].getExceptionTypes();

    }
}

package myreflect2;

public class MyReflectDemo {
    public static void main(String[] args) {
        /*
            Class类中用于获取构造方法的方法
                Constructor<?>[] getConstructors(); 获取所有公共的构造方法
                Constructor<?>[] getDeclaredConstructors(); 获取所有构造方法，包括私有构造方法
                Constructor<?> getConstructor(Class<?>... parameterTypes); 获取指定参数类型的构造方法
                Constructor<?> getDeclaredConstructor(Class<?>... parameterTypes); 获取指定参数类型的构造方法，包括私有构造方法

                Constructor类中用于创建对象的方法
                    T newInstance(Object...initargs) 创建对象
                    setAccessible(boolean flag) 设置是否可以访问私有构造方法
         */
    }
}

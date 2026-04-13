package myexceptionDemo1;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        /*
            2.如果try中可能会遇到多个问题，怎么执行？
                如果只有一个catch如果先执行的异常可以被捕获，那么将直接跳转执行catch，
                不会执行下面的代码。反之会进行JVM中默认的处理异常的方式
                会写多个catch与之对应
                细节：
                    如果我们要捕获多个异常，这些异常中如果存在父子关系，那么父类一定要写在下面
                了解性：
                    在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                    表示如果出现了A异常或者B异常的话，采取同一种处理方案
         */
    }
}

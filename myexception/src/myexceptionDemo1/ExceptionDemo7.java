package myexceptionDemo1;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        /*
            public String getMessage() 返回此throwable的详细消息字符串
            public String toString() 返回此可抛出的简短描述
            public void printStackTrace() 在底层是利用System.err.println
                                          进行输出把异常的错误信息输出在控制台
                                          细节：仅仅是打印错误信息，不会停止程序运行
         */

        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[20]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("程序继续运行");
    }
}

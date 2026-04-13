package MygenericsDemo1;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        /*
            需求：
                定义一个方法，形参是一个集合，但是集合中的数据类型不确定。
         */

        //创建集合对象
        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> List2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();

        method(list1);
        method(List2);
        method(list3);

    }


    /*
        此时泛型里面写的是什么类型，那么只能传递什么类型的数据
        弊端：
            利用泛型方法有一个小弊端，此时他可以接受任何的数据类型
            Ye Fu Zi Student

        希望：本方法虽然不确定类型，但是以后我希望只能传递Ye Fu Zi

        此时我们就可以使用泛型的通配符：
                ？也表示不确定的类型
                他可以进行类型的限定
                ? extends E：表示可以传递E类型或者所有的子类类型
                ? super E：表示可以传递E类型或所有的父类类型

        应用场景：
            1.如果我们在定义类，方法，接口的时候，如果类型不确定，就可以定义泛型类，泛型方法，泛型接口。
            2.如果类型不确定，但是能知道以后只能传递某个继承体系中，就可以使用泛型的通配符
        泛型的通配符：
            关键点：可以限定类型的范围。
     */
    public static<E> void method(ArrayList<E> list){

    }

    public class Ye{}
    public class Fu extends Ye{}

     public class Zi extends Fu{}
}

package myobjectstreamDemo1;

import java.io.Serializable;

/*
    Serializable接口里面是没有抽象方法的，标记型接口
    一旦实现了这个接口，那么就表示当前Student类可以被序列化
    理解：
        一个物品的合格证
 */
public class Student implements Serializable {
    //序列化对象后，修改了Javabean类，再次反序列化，会出问题，会抛出InvalidClassException异常
    //解决方案：给Javabean类添加serialVersionUID(序列号，版本号)
    private static final long serialVersionUID = 5523645164042269664L;
    private String name;
    private int age;

    //transient：瞬态关键字
    //作用：不会把当前属性序列化到本地文件当中
    private transient String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.it.MyStatic1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="王老师";
        //1.创建第一个学生对象
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName="王老师";
        s1.show();
        s1.study();

        //2.创建第二个学生对象
        Student s2=new Student("李四",19,"女");
        s2.show();
        s2.study();
    }
}

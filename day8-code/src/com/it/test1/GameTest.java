package com.it.test1;

public class GameTest {
    public static void main(String[] args) {
        //1.创建角色
        Role r1=new Role("张三",100);
        Role r2=new Role("李四",100);

        //2.角色攻击
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的血量
            if(r2.getBlood()==0){
                System.out.println(r2.getName()+"被"+r1.getName()+"打败了");
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            //判断r1的血量
            if(r1.getBlood()==0){
                System.out.println(r1.getName()+"被"+r2.getName()+"打败了");
                break;
            }
        }
    }
}

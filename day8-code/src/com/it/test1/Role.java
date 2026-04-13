package com.it.test1;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    public void attack(Role role){
        //计算造成的伤害 1~20
        Random r=new Random();
        int hurt=r.nextInt(20)+1;

        //修改挨揍的人的血量
        //剩余血量
        int remainBoold = role.getBlood()-hurt;
        remainBoold=remainBoold<0?0:remainBoold;
        role.setBlood(remainBoold);

        System.out.println(this.getName()+"举起拳头打了"+role.getName()+
                "一拳，造成了"+hurt+"点伤害,还剩下"+role.getBlood()+"点血量");
    }
}

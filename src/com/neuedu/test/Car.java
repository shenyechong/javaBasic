package com.neuedu.test;

public class Car {
    String mark;
    int price;
    int speed;

    public void drive(){
        System.out.println("本车正在驾驶");
    }
    public void speedChange(int newSpeed){
        System.out.println("本车原来的速度是"+speed);
        this.speed = newSpeed;
        System.out.println("本车现在的速度是"+newSpeed);
    }
    public void test(){
        System.out.println("本车的品牌是"+mark);
        System.out.println("本车的价格是"+price);
    }
}

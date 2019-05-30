package com.neuedu.test;

public class Circle {

    int i;

    public double area(){
        double a = 0;
        if (i>0){
            a = i*i*3.14;
        }else {
            System.out.println("请输入正数");
        }
        return a;
    }
    public double perimeter(){
        double b = 0;
        if (i>0){
            b = i*2*3.14;
        }else {
            System.out.println("请输入正数");
        }
        return b;
    }
}

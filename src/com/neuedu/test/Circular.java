package com.neuedu.test;

public class Circular extends Graphics {

    public void per(){
        System.out.println("周长是:"+this.getRadius()*2*3.14);
    }
    public void area(){
        System.out.println("面积是"+this.getRadius()*this.getRadius()*3.14);
    }
}

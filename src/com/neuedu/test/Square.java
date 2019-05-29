package com.neuedu.test;

public class Square extends Graphics{
    public void p(){
        System.out.println("周长是:"+this.getRadius()*4);
    }
    public void ar(){
        System.out.println("面积是"+this.getRadius()*this.getRadius());
    }
}

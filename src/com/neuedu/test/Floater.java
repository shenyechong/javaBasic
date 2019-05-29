package com.neuedu.test;

public class Floater extends Type {
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void computeSalay(){
        System.out.println(this.getName()+"的工资是"+this.getTime()*this.getSalay());
    }
}

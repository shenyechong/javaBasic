package com.neuedu.test;

public class Worker extends Type {
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void computeSalay(){
        System.out.println(this.getName()+"的工资是"+this.getSalay()*this.getDay());
    }
}

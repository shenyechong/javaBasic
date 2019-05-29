package com.neuedu.test;

public class Floaterzl extends Parsonzl {
    private float salary;
    private int hour;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void computeSalay(){
        System.out.println(salary*hour);
    }
}

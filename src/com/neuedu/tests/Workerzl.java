package com.neuedu.tests;

public class Workerzl extends Parsonzl {
    private float salary;
    private int day;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void computeSalay(){
        System.out.println(salary*day);
    }
}

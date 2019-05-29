package com.neuedu.test;

public class Salesmanzl extends Parsonzl {
    private float salary;
    private float braise;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBraise() {
        return braise;
    }

    public void setBraise(float braise) {
        this.braise = braise;
    }
        public void computeSalay(){
            System.out.println(salary+braise);
        }

}

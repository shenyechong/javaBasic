package com.neuedu.test;

public class TestPersonzl {
    public static void main(String[] args) {
        Workerzl w1 = new Workerzl();
        w1.setName("gounanren");
        w1.setDay(40);
        w1.setSalary(200);
        w1.computeSalay();
        Managerzl m1 = new Managerzl();
        m1.setName("jdfks");
        m1.setSalary(10000);
        m1.computeSalay();
        Floaterzl f1 = new Floaterzl();
        f1.setName("ahan");
        f1.setHour(8);
        f1.setSalary(20);
        f1.computeSalay();
        Salesmanzl s1 = new Salesmanzl();
        s1.setName("lala");
        s1.setSalary(5000);
        s1.setBraise(400);
        s1.computeSalay();
    }
}

package com.neuedu.tests;

public class Personzlad {
    private String names;
    private int age;
    private double height;

    public String getName() {
        return names;
    }

    public void setNames(String name) {
        this.names = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void sayHello(){
        System.out.println("hello,my name is "+names);
    }
}

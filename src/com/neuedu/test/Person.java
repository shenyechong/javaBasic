package com.neuedu.test;

public class Person {
    private String name;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }
}

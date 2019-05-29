package com.neuedu.test;

public class Persom1 {
    private String name;
    private double height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }
}

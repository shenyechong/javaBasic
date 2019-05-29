package com.neuedu.test;

public class PersonCreate1 extends Persom1 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello,my name is "+this.getName());
    }

}

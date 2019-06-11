package com.neuedu.HomeWork0611;

public class First_Worker {
    private String name;
    private int age;
    private int money;

    public First_Worker(){

    }
    public First_Worker(String name, int age, int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return name+"  "+age+"  "+money;
    }

    public void work(){
        System.out.println(name+"work");
    }
}

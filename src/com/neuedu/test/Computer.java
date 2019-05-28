package com.neuedu.test;

public class Computer {
    private char color;
    private int cpu;

    public Computer(){

    }
    public Computer(char color,int cpu){
        this.color = color;
        this.cpu = cpu;
    }
    public void a(){
        System.out.println("笔记本的颜色是"+color+" , "+"笔记本CPU的型号是"+cpu);
    }

}

package com.neuedu.test;

public class Students {
    private String name;
    private String no;
    private int chinese;
    private int math;
    private int english;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void pingjun(){
        int a = (chinese+english+math)/3;
        System.out.println(name+"的平均成绩是:"+a);
    }

}

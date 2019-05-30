package com.neuedu.test;

import java.util.Scanner;

public class Wages {
    private String name;
    private char sex;
    private String birthday;
    private String type;
    private double wages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void computeSalay(){
        if (type=="worker"){
            Scanner time = new Scanner(System.in);
            System.out.println("请输入工作的天数");
            int t = time.nextInt();
            if (t<0){
                System.out.println("天数不合法,请输入正确的天数");
            }else{
                wages = t*200;
            }
        }else if (type=="salesman"){
            Scanner time = new Scanner(System.in);
            System.out.println("请输入工作的天数");
            double t = time.nextDouble();
            Scanner sale = new Scanner(System.in);
            System.out.println("请输入销售额");
            int s = sale.nextInt();
            if (s<0){
                System.out.println("输入不正确,请重新输入");
            }else{
                wages = (t/30)*(s*0.05)+8000;
            }
        }else if (type=="manager"){
            Scanner time = new Scanner(System.in);
            System.out.println("请输入工作的天数");
            double t = time.nextDouble();
            if (t<0){
                System.out.println("天数不合法,请输入正确的天数");
            }else{
                wages = (t/30)*10000;
            }
        }else if (type=="floater"){
            Scanner time = new Scanner(System.in);
            System.out.println("请输入工作的时长或天数");
            double t = time.nextDouble();
            if (t<0){
                System.out.println("时间不合法,请输入正确的时长");
            }else if (t>24){
                wages = t*100;
            }else if (t<=24){
                wages = t*8*100;
            }
        }
        System.out.println(name+"的工资是"+wages);
    }

}

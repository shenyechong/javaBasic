package com.neuedu.test;

public class Salesman extends Type {
    private float exsalay;

    public float getExsalay() {
        return exsalay;
    }

    public void setExsalay(float exsalay) {
        this.exsalay = exsalay;
    }
    public void computeSalay(){
        System.out.println(this.getName()+"的工资是"+(exsalay+getSalay()));
    }
}

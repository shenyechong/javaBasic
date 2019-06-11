package com.neuedu.HomeWork0611;

public class Third_Email {
    private String name;
    private String jie;
    private String shi;
    private String sheng;
    private String state;

    public Third_Email(){

    }
    public Third_Email(String name,String jie,String shi,String sheng,String state){
        this.name = name;
        this.jie = jie;
        this.shi = shi;
        this.sheng = sheng;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "姓名 "+name+" 街道 "+jie+" 市(县) "+shi+" 省(自治区) "+sheng+" 国家(地区) "+state;
    }
}

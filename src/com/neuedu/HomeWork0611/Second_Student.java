package com.neuedu.HomeWork0611;

import java.util.ArrayList;
import java.util.List;

public class Second_Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Second_Student(){}
    public Second_Student(String name, int age, int score, String classNum){
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Second_Student("Tom", 18, 100, "class05"));
        list.add(new Second_Student("Jerry", 22, 70, "class04"));
        list.add(new Second_Student("Owen", 25, 90, "class05"));
        list.add(new Second_Student("Jim", 30,80 , "class05"));
        list.add(new Second_Student("Steve", 28, 66, "class06"));
        list.add(new Second_Student("Kevin", 24, 100, "class04"));

        int ageAver = AgeAver(list);
        System.out.println("平均年龄: "+ageAver);

        int scoreAver = ScoreAver(list);
        System.out.println("平均分数: "+scoreAver);

    }

    private static int AgeAver(List list) {
        int agesum = 0;
        int ageAver;
        for (Object s:list
             ) {
            Second_Student stu = (Second_Student) s;
            agesum+=stu.getAge();
        }
        ageAver = agesum/list.size();
        return ageAver;
    }

    private static int ScoreAver(List list) {
        int scoresum = 0;
        int scoreAver;
        for (Object o:list
             ) {
            Second_Student s = (Second_Student) o;
            scoresum+=s.getScore();
        }
        scoreAver = scoresum/list.size();
        return scoreAver;
    }
}

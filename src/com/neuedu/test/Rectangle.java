package com.neuedu.test;

public class Rectangle {
    int weight;
    int height;

    public int perimeter(){
        int P = (weight+height)*2;
        return P;
    }
    public  int area(){
        int A = weight*height;
        return A;
    }
}

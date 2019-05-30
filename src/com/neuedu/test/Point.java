package com.neuedu.test;

public class Point {
    public int x;
    public int y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x0,int y0){
        this.x = x0;
        this.y = y0;
    }
    public void movePoint(int dx,int dy){
        this.x = dx+x;
        this.y = dy+y;
    }
}

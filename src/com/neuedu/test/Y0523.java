package com.neuedu.test;

import java.util.Scanner;

public class Y0523 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int math = s.nextInt();


        int a = math/100;
        int b = math%10;
        int c = (math/10)%10;

        if (math/100>=10){
            System.out.println("数字太大啦...换个三位数的来");
        }else {

            int M = (b*100)+(c*10)+a;

            System.out.println("输入的数是"+math);
            System.out.println("输出的数是"+M);



        }


        s.close();

    }
}

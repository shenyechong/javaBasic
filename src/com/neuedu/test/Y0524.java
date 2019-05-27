package com.neuedu.test;

import java.io.IOException;
import java.util.Scanner;

public class Y0524 {
    public static void main(String[] args) throws IOException {
   //  1.
//        for (int i = 100;i<=999;i++){
//            int a = i/100;
//            int b = (i/10)%10;
//            int c = i%10;
//
//            if (i==a*a*a+b*b*b+c*c*c){
//                System.out.println("水仙花数是:"+i);
//            }else{
//                continue;
//            }
//        }

   //  2.
//        Scanner i = new Scanner(System.in);
//        System.out.println("请输入分数:");
//        int a = i.nextInt();
//        if (a>=90){
//            System.out.println("A");
//        }else if (a>=60&&a<=89){
//            System.out.println("B");
//        }else {
//            System.out.println("C");
//        }

    //  3.
//        int i [] = {1,2,3,4};
//        int j = 0;
//        for (int a = 0;a<i.length;a++){
//            for (int b = 0;b<i.length;b++){
//                for (int c = 0;c<i.length;c++){
//                    if (i[a]!=i[b]&&i[a]!=i[c]&&i[b]!=i[c]){
//                        System.out.println(i[a]*100+i[b]*10+i[c]);
//                        j++;
//                    }
//                }
//            }
//        }
//        System.out.println("一共有"+j+"种");

    //  4.
//        long b = 1;
//        for (int a = 1;a<=9;a++){
//            b = a * b;
//        }
//        System.out.println("9!的值为:"+b);

    //  5.
//        int i = 0;
//        int j = 0;
//        for (int a = 1;a<=100;a++){
//            if (a%2==1){
//            i=a+i;
//            }else{
//            j=a+j;
//            }
//        }
//        System.out.println("基数和为"+i+"   "+"偶数和为"+j);

    //  6.
//            Scanner i = new Scanner(System.in);
//            System.out.println("请输入数字");
//            int j = i.nextInt();
//            int a = j/10000;
//            int b = (j/1000)%10;
//            int c = (j%1000)/100;
//            int d = (j%100)/10;
//            int e = j%10;
//            if (j>100000||j<10000){
//                System.out.println("不是一个五位数");
//            }else if (a==e&&b==d){
//                System.out.println(j+"是一个回文数");
//            }else {
//                System.out.println(j+"不是一个回文数");
//            }

    // 7.
//        Scanner i = new Scanner(System.in);
//        System.out.println("请输入年份");
//        int j = i.nextInt();
//        if (j%4==0&&j%100!=0||j%400==0){
//            System.out.println(j+"是闰年");
//        }else{
//            System.out.println(j+"是平年");
//        }

    // 8.(1).
//            char a = (char)System.in.read();
////            if (a>='a'&&a<='z'){
////               a-=32 ;
////               System.out.println(a);
////            }else {
////                System.out.println(a);
////            }
//       (2).
//            Scanner i = new Scanner(System.in);
//            String a = i.next();
//            char b = a.charAt(0);
//            if (b>='a'&&b<='z'){
//                b-= 32;
//                System.out.println(b);
//            }else{
//                System.out.println(b);
//            }

    // 9.
//        int a = 1;
//        int b = 0;
//        while (a<=200){
//        if (a%3==0){
//            b = a+b;
//        }
//            a++;
//        }
//        System.out.println(b);

    // 10.
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = 0;
        while (a>0){
           b+= a%10;
           a = a/10;
        }
            b+=a;
        if (b%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }
    }
}
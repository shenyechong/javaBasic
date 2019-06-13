package com.neuedu.HomeWork0613;

import java.util.HashSet;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();

        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符");
        String a = s.next();
        char[] arr = a.toCharArray();

        for (Character c:arr
             ) {
            hashSet.add(c);
        }
        for (char d:hashSet
             ) {
            System.out.print(d);
        }
    }
}

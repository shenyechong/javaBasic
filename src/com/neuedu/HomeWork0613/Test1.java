package com.neuedu.HomeWork0613;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        for (int j = 0; j < 10; j++) {
            Random random = new Random();
            int i = 1+random.nextInt(101);
            if (i>=10){
                list.add(i);
            }
        }
        System.out.println(list);
    }

}

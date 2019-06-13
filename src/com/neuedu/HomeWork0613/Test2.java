package com.neuedu.HomeWork0613;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(88);
        list.add(3);
        list.add(88);
        list.add(3);
        list.add(88);
        list.add(5);
        System.out.println(listTest(list,88));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == s)
            return i;
        }
        return -1;
    }
}

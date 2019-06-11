package com.neuedu.HomeWork0611;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class First_Test {
    public static void main(String[] args) {
        List<First_Worker> list = new LinkedList<>();
        list.add(new First_Worker("zhang3",18,3000));
        list.add(new First_Worker("li4",25,3500));
        list.add(new First_Worker("wang5",22,3200));

        list.add(1,new First_Worker("zhao6",24,3300));
        ((LinkedList<First_Worker>) list).removeLast();
        for (First_Worker s:list
             ) {
            System.out.println(s);
        }
        System.out.println("========迭代遍历========");
        Iterator<First_Worker> i = list.iterator();
        while (i.hasNext()){
            First_Worker w = i.next();
            System.out.println(w.toString());
        }


    }
}

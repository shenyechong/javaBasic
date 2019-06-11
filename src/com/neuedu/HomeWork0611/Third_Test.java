package com.neuedu.HomeWork0611;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Third_Test {
    public static void main(String[] args) {
        List<Third_Email> list = new ArrayList<>();
        list.add(new Third_Email("张三","ss","ss","ss","ss"));
        list.add(new Third_Email("张三","ss","ss","ss","ss"));
        list.add(new Third_Email("张三","ss","ss","ss","ss"));
        list.add(new Third_Email("张三","ss","ss","ss","ss"));

        Iterator<Third_Email> i = list.iterator();
        while(i.hasNext()){
            Third_Email t = i.next();
            System.out.println(t.toString());
        }

    }
}

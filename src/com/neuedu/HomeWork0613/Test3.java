package com.neuedu.HomeWork0613;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Iterator<Map.Entry<Integer,String>> i = map.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Integer,String> entry = i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("=================================");

        map.put(5,"李晓红");
        map.remove(1);
        if (map.containsKey(2)){
            map.put(2,"周林");
        }
        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

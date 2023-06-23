package org.example._2023_06_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        String[] strings = {"QQ", "WW", "JJ"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String name : strings) {
            System.out.println(name);
        }
        List<String> list = new ArrayList<>();
        list.add("QQ");
        list.add("DD");
        list.add("SS");
        list.add("RR");
        list.add("WW");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String name:list) {
            System.out.println(name);
        }

        Set<String> set = new HashSet<>();
        set.add("EE");
        set.add("PP");
        set.add("OO");
        set.add("II");
        set.add("UU");
        set.add("TT");
        System.out.println(set);
        for (String name:set) {
            System.out.println(name);
        }

    }
}

package org.example._2023_06_13;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {

        java.util.Map<Integer, String> mapFamily = new TreeMap<>();
        mapFamily.put(1, "A");
        mapFamily.put(2, "S");
        mapFamily.put(3, "F");
        mapFamily.put(422222, "B");
        mapFamily.put(5, "R");
        mapFamily.put(6, "N");
        mapFamily.put(66, null);
        //mapFamily.put(null, "!!!!");

        System.out.println(mapFamily);

        for (java.util.Map.Entry<Integer, String> m : mapFamily.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for (int i = 0; i < mapFamily.size(); i++) {

        }

        List<String> list = new ArrayList<>();
        list.add("4");
        list.add("42");
        list.add("43");
        list.add("44");

        int t = list.get(0).length() * list.get(0).hashCode();

        for (String i : list) {
            System.out.println(i);
        }
    }
}

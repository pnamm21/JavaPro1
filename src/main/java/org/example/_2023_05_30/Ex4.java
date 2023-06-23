package org.example._2023_05_30;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static int getSumAllElements(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("List size is: " + list.size());
        System.out.println(getSumAllElements(list));
    }
}


package org.example._2023_06_27.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SA2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        List<Integer> integerList = list.stream()
                .filter(el -> el % 2 == 0)
                .sorted()
                .distinct()
                .map(el -> el * 10)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}

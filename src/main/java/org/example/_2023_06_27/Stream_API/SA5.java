package org.example._2023_06_27.Stream_API;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SA5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 2, 3, 4};

        Arrays.stream(arr)
                .filter(el -> {
                    System.out.println("!!!!!");
                    return el % 2 == 0;
                }).toArray();

    }
}

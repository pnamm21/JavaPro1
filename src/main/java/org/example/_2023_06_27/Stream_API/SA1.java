package org.example._2023_06_27.Stream_API;

import java.util.Arrays;

public class SA1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 7, 1, 2, 3, 8, 1};

        /**
         * - find even number
         * - next sort by increase
         * - next set only unique number
         * - next multiply each by 10
         * - next collect numbers in Array
         **/

        int[] der = Arrays.stream(arr)// {4, 2, 5, 6, 7, 1, 2, 3, 8, 1}
                .filter(el -> el % 2 == 0)// {4, 2, 6, 2, 8}
                .sorted()// {2, 2, 4, 6, 8}
                .distinct()// {2, 4, 6, 8}
                .map(el -> el * 10)// {20, 40, 60, 80}
                .toArray();// {20, 40, 60, 80}

        System.out.println(Arrays.toString(der));
    }
}

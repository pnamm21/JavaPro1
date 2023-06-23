package org.example._2023_05_30;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
        int[]unique=Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(unique));
    }


}

package org.example._2023_05_23;

import java.util.Arrays;

public class Ex1 {
    private static boolean isSym(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        boolean b = true;

        while (start != end) {
            if(arr[start] != arr[end]) {
                b = false;
                break;
            }
            start++;
            end--;
        }
        return b;
    }

    private void getNumber(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(s));
//        System.out.println(s[0]);

        int sum = 0;
        for (int i = s.length-1; i >= 0; i--) {
            sum = sum + s[i];
        }
        System.out.println(sum);
    }
}

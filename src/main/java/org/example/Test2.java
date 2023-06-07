package org.example;

import java.util.Arrays;

public class Test2 {

    private static boolean isSym(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean b = true;

        while (start != end) {
            if (arr[start] != arr[end]) {
                b = false;
                break;
            }
            start++;
            end--;
        }
        return b;
    }

    public void getMin(int[] arr){
        int min=arr[0];
        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public void getMinimum(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                System.out.println(arr[i]);
            }else{
                System.out.println("dont have this number in massive");
            }
        }
    }

    public void Min(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min3) {
                min3 = arr[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
    }

    public void change(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_i = 0;
        int max_i = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_i = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                max_i = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println();
        index = min;
        min = max;
        max = index;
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] strings = {6, 9, -2, 4, 77, 4, 24};
        int[] s = {2, 10, 10, 10, 10};
//        System.out.println(Arrays.toString(strings));
//        System.out.println(strings[0]);
//
//        int sum = 0;
//        for (int i = strings.length - 1; i >= 0; i--) {
//            sum += strings[i];
//        }
//        System.out.println(sum);

        Test2 t = new Test2();
//        t.getMin(strings);
//        System.out.println();
//        t.getMinimum(strings,3);
//        System.out.println();
//        t.Min(strings);
//        System.out.println();
//        t.Min(s);
//        System.out.println();
        t.change(strings);




    }


}

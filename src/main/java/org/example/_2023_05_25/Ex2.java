package org.example._2023_05_25;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};
        int[] arr1 = {12, 321, 34, 2, 223, 22, 321};
//        int a=sum(10,25);
//        System.out.println(a);
//        System.out.println(Arrays.toString(createRandomArray(20,55)));
//          System.out.println(Arrays.toString(createRandomArray(20, 50)));
//        System.out.println("Average: "+average(createRandomArray(1, 10)));
//        getEvenElem(createRandomArray(2,9));
//        System.out.println(oddNumber(createRandomArray(20, 40)));
//        System.out.println(Arrays.toString(evenNumber(createRandomArray())));
//        System.out.println(isPalindrom1(arr));
//        System.out.println(isPalindrom1(arr1));
//        System.out.println(repeateNumber2(createRandomArray()));
//        increment(createRandomArray());
//        System.out.println(sumElem(arr1));
//        System.out.println(sumElem1(createRandomArray()));

    }
    public static int sumElem1(int[]arr){
        int s =0;
        if(arr.length%2==0){
            for (int i = 0; i < arr.length/2; i++) {
                s+=arr[i]+arr[arr.length/2+i];
            }
        }else{
            for (int i = 0; i < arr.length/2; i++) {
                s+=arr[i]+arr[arr.length-i-1];
            }
        }
        return s;
    }
    public static int sumElem(int[]arr){

        int sum=0;
        if(arr.length%2==0){
            System.out.println("Even");
            for (int i = 0; i < arr.length; i+=2) {
                sum+=arr[i];
            }
        }else{
            System.out.println("Odd");
            for (int i = 1; i < arr.length; i+=2) {
                sum+=arr[i];
            }
        }
       return sum;
    }
    public static void increment(int[]arr){
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr[i]*=10;
            }else if(arr[i]%2!=0){
                arr[i]*=1000;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean repeateNumber2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPalindrom1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean b = true;
        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }

    public static int[] evenNumber(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 10;
            }
        }
        return arr;
    }

    public static int oddNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void getEvenElem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }


}

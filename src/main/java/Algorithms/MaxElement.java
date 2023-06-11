package Algorithms;

import java.util.Arrays;

public class MaxElement {
    public static int findMaxElemRecursive(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }
        int middle = (start + end) / 2;

        int firstHalf = findMaxElemRecursive(arr, start, middle);
        int secondHalf = findMaxElemRecursive(arr, middle + 1, end);
        return Math.max(firstHalf, secondHalf);
    }

    public static int findMaxElem(int[] arr) {
        if (arr==null||arr.length==0){
            throw new IllegalArgumentException("Array is empty or null!");
        }

        int max = arr[0];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] > max) {
                max = arr[start];
            }
            if (arr[end] > max) {
                max = arr[end];
            }
            start++;
            end--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int[] array ={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int max = findMaxElemRecursive(arr, 0, arr.length - 1);
        System.out.println("Max numberRecursive is = " + max);
        System.out.println(Arrays.toString(arr));
        int max1 = findMaxElem(arr);
        int max2 = findMaxElem(array);
        System.out.println("Max numberIterative is = " + max1);
        System.out.println("Max numberIterative is = " + max2);
    }
}

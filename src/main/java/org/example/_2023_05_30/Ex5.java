package org.example._2023_05_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex5 {

    public static void maxTwoList(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max2 = max;
                max = list.get(i);
            } else if (list.get(i) > max2 && max2 != max) {
                max2 = list.get(i);
            }
        }
        System.out.println(max2);
    }

    public static List<Double> createRandomList() {
        Random random = new Random();
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextDouble(20));
        }
        return list;
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }

    public static void sortList(List<Integer> list, int k) {
        Collections.sort(list);
        int sum = 0;
        int start = 0;
        int end = list.size() - 1;
        while (start != end) {

            sum = list.get(start) + list.get(end);
            if (sum > k) {
                end--;
            } else if (sum < k) {
                start++;
            } else if (sum == k) {
                System.out.println("We find element: " + sum);
            } else {
                break;
            }

        }
    }

    public static int getAvg(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public static double getAverage(List<Double> list) {
        double even = 0;
        double odd = 0;
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even += list.get(i);
                evenCount++;
            } else {
                odd += list.get(i);
                oddCount++;
            }
        }
        even /= evenCount;
        odd /= oddCount;
        return even / odd;
    }
    public static void main(String[] args) {
        System.out.println(createRandomList());
    }
}


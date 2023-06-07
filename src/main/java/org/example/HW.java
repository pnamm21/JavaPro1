package org.example;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

        int[] arr = {2, -5, 88, 23, -3, -6, 5, 4};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 2, 1, 2, 4, 1, 2, 3, 1};
        HW test = new HW();
//        test.getSum(arr);
//        test.getTheBiggestNumber(arr);
//        test.getEvenNumber(arr);
//        System.out.println(isSymmetric(arr));
//        test.getMultiNumber(arr);
//        test.repeatElem(arr);
//        test.bubbleSort(arr);
//        System.out.println(test.isPalindrom(arr1));
//        test.delNegativeNum(arr);
//        test.getMinandMax();
//        test.getAmountOfNumber(arr);
//        System.out.println("Массив 1 упорядочен по возрастанию:"+test.sortCorrect(arr));
//        System.out.println("Массив 2 упорядочен по возрастанию:"+test.sortCorrect(arr1));
//        System.out.println("Массив 2 упорядочен по возрастанию:"+test.sortCorrect(arr2));
//        test.secondBiggest(arr);
//        test.reverseOrder(arr1);
//        System.out.println("The smallest sum is: "+test.findSmallestSum(arr2));

    }

    public void getSum(int[] arr) {
        //Task 1
        //Найти сумму элементов в заданном одномерном массиве.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Summa:" + sum);
    }

    public void getTheBiggestNumber(int[] arr) {
        //Task 2
        //Найти наибольший элемент в заданном одномерном массиве.
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The Biggest number:" + max);
    }

    public void getEvenNumber(int[] arr) {
        // Task 3
        // Подсчитать количество четных элементов в заданном одномерном массиве.
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
    }

    public static boolean isSymmetric(int[] arr) {
        // Task 4
        //Проверить, является ли заданный одномерный массив симметричным
        // (элементы симметрично расположены относительно центра).
        boolean result = false;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public void getMultiNumber(int[] arr) {
        // Task 5
        // Найти произведение элементов в заданном одномерном массиве.
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            multi *= arr[i];
        }
        System.out.println(multi);
    }

    public void repeatElem(int[] arr) {
        //Task 6
        //Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                System.out.println("Massive have same number");
            } else {
                System.out.println("Have not");
            }
        }


    }

    public void bubbleSort(int[] arr) {
        //Task7
        //Отсортировать заданный одномерный массив по возрастанию.
//        Arrays.sort(arr);
//
//        for (int elem:arr) {
//            System.out.println(elem+"");
//        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int elem : arr) {
            System.out.println(elem + "");
        }
    }

    public boolean isPalindrom(int[] arr1) {
        //Task 8
        //Проверить, является ли заданный одномерный массив палиндромом
        // (читается одинаково слева направо и справа налево).
        boolean b = true;
        for (int i = 0; i < arr1.length / 2; i++) {
            if (arr1[i] == arr1[arr1.length - i - 1]) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }

    public void delNegativeNum(int[] arr) {
        //Task 9
        //Удалить все отрицательные элементы из заданного одномерного массива.
        int[] newArr = new int[arr.length]; // Создание нового массива той же длины

        int index = 0;
        for (int i : arr) {
            if (i >= 0) {
                newArr[index] = i;
                index++;
            }
        }
        // Изменение размера нового массива до количества положительных элементов
        newArr = Arrays.copyOf(newArr, index);
        System.out.println(Arrays.toString(newArr));
    }

    public void getMinandMax() {
        //Task 10
        //Найти наименьший и наибольший элементы
        // в заданном одномерном массиве и поменять их местами.
        int[] array = {2, -5, 88, 23, -3, -6, 5, 4};
        int min = 0, max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }
        int tmp = array[min];
        array[min] = array[max];
        array[max] = tmp;
        System.out.println("Massive after correcting:" + Arrays.toString(array));
    }

    public void getAmountOfNumber(int[] arr) {
        //Task 11
        //Подсчитать количество элементов, которые больше среднего значения
        // всех элементов в заданном одномерном массиве.
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;

        int n = 0;
        for (int elem : arr) {
            if (elem > average) {
                n++;
            }
        }
        System.out.println("Average:" + average);
        System.out.println("Amount of element,larger than average:" + n++);
    }

    public boolean sortCorrect(int[] arr) {
        //Task 12
        //Проверить, является ли заданный одномерный массив
        // упорядоченным по возрастанию.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public void secondBiggest(int[] arr) {
        //Task 13
        //Найти второй по величине элемент в заданном одномерном массиве.
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }

    public void reverseOrder(int[] arr) {
        //Task 14
        //Перевернуть заданный одномерный массив
        // (элементы располагаются в обратном порядке).
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public int findSmallestSum(int[] arr) {
        //Task 15
        //Найти наименьшую сумму двух соседних
        // элементов в заданном одномерном массиве.
        int smallSum = arr[0] + arr[1];
        for (int i = 1; i < arr.length-1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum < smallSum) {
                smallSum = sum;
            }
        }
        return smallSum;
    }

}

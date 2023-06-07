package org.example._2023_05_23;

public class Exercise {
    public static void main(String[] args) {
        Exercise t = new Exercise();
        int[] arr = {2, 3, 4, 51, 6, 83, 5};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2={1,2,3,2,1};
        String[] strings = {"pizza", "mama", "rabota"};

//        System.out.println(t.average(arr1));
//        System.out.println("Summa: "+t.findSumAllNUmberInMassive(arr));
//        t.findMaxAndMinNumber(arr);
//        System.out.println(t.isPalindrom(arr2));
//        System.out.println(t.isPalindrom(arr));
//        t.sortMassive(arr);


    }

    public double average(int[] arr) {
        //Task 1
        //Найти среднее значение элементов в массиве.
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

    public int findSumAllNUmberInMassive(int[] arr) {
        //Task 2
        //Найти сумму всех элементов в массиве.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public void findMaxAndMinNumber(int[] arr) {
        //Task 3
        //Найти максимальное и минимальное значение в массиве.
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The smallest number:" + min);
        System.out.println("The largest number:" + max);
    }

    public void findRepeatNumber(int[] arr) {
        //Task 4
        //Определить, есть ли в массиве повторяющиеся элементы.
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                System.out.println("Massive have same number");
            } else {
                System.out.println("Have not");
            }
        }
    }

    public void sortMassive(int[] arr) {
        //Task 5
        //Отсортировать массив по возрастанию.
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

    public boolean isPalindrom(int[]arr){
        //Проверить, является ли массив палиндромом
        // (элементы читаются одинаково слева направо и справа налево)
        // без использования дополнительного массива.
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public void selectionSort(int[]arr){
        //Отсортировать массив по убыванию
        // с использованием алгоритма сортировки выбором.
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }
}

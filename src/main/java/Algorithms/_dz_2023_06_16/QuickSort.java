package Algorithms._dz_2023_06_16;

import java.util.Stack;



public class QuickSort {

    // Recursive way
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int privotIndex = helperPrivot(arr, startIndex, endIndex);
            quickSort(arr, startIndex, privotIndex - 1);
            quickSort(arr, privotIndex + 1, endIndex);

        }
    }

    public static int helperPrivot(int[] arr, int low, int high) {
        int privot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= privot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    // Iterative way with Stack
    public static void quickSortIterative(int[] array, int start, int end) {
        // Создаем стек для хранения начальных и конечных индексов подмассивов
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        stack.push(end);

        // Пока стек не пуст, продолжаем обработку подмассивов
        while (!stack.isEmpty()) {
            end = stack.pop();
            start = stack.pop();

            // Выполняем разделение подмассива и получаем индекс опорного элемента
            int privot = partition(array, start, end);

            // Если есть подмассивы перед опорным элементом, добавляем их в стек
            if (privot - 1 > start) {
                stack.push(start);
                stack.push(privot - 1);
            }

            // Если есть подмассивы после опорного элемента, добавляем их в стек
            if (privot + 1 < end) {
                stack.push(privot + 1);
                stack.push(end);
            }
        }
    }

    public static int partition(int[] array, int start, int end) {
        int privot = array[end];
        int i = start - 1;

        // Проходим по подмассиву и перемещаем элементы меньше
        // или равные опорному элементу влево от него
        for (int j = start; j < end; j++) {
            if (array[j] <= privot) {
                i++;
                swap(array, i, j);

            }
        }
        // Помещаем опорный элемент в правильную позицию
        swap(array, i + 1, end);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 6};
//        quickSort(arr, 0, arr.length - 1);
        quickSortIterative(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

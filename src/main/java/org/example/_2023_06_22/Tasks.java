package org.example._2023_06_22;

import java.util.*;

public class Tasks {

    public static List<String> findFailedStudent(Map<String, Boolean> map) {
//        У вас есть Map<String, Boolean>, представляющая студентов и их оценки
//        (true - сдал экзамен, false - не сдал).
//        Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.
        map.put("Nam", true);
        map.put("Said", false);
        map.put("Vlad", true);
        map.put("Max", false);
        map.put("Bogdan", true);
        map.put("Egor", true);
        List<String> failedStudents = new ArrayList<>();

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String name = entry.getKey();
            boolean pass = entry.getValue();
            if (!pass) {
                failedStudents.add(name);
            }
        }
        return failedStudents;
    }

    public static int countNotAvailProduct() {
//    У вас есть Map<String, Boolean>, представляющая список продуктов в магазине и
//    информацию о их наличии (true - продукт в наличии, false - продукта нет).
//    Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.
        Map<String, Boolean> map1 = new HashMap<>();
        map1.put("apple", true);
        map1.put("orange", false);
        map1.put("cheese", true);
        map1.put("meet", false);
        map1.put("banana", false);
        map1.put("yogurt", true);
        int count = 0;
        for (Boolean entry : map1.values()) {
            if (!entry) {
                count++;
            }
        }
        return count;
    }

    public static void findNameStartWithLetter() {
//    У вас есть список List<String>, содержащий имена людей.
//    Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
//    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
//    char targetLetter = 'C';
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        char targetLetter = 'C';
        for (String str : names) {
            if (str.startsWith(String.valueOf(targetLetter))) {
                System.out.println(str);
            }

        }
    }

    public static void findPariWords() {
//    У вас есть список List<String>, содержащий слова.
//    Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
//    List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
        for (int i = 0; i < words.size(); i++) {
            String name1 = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                String name2 = words.get(j);

                if (isReverse(name1, name2)) {
                    System.out.println(name1 + " - " + name2);
                }
            }
        }
    }

    public static boolean isReverse(String name1, String name2) {
        StringBuilder reverseWord = new StringBuilder(name2).reverse();
        return name1.equals(reverseWord.toString());
    }

    public static int getSum(int[] array) {
//    -Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getAverage(int[] array) {
//    -Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.
        int average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return average = sum / array.length;
    }

    public static int getSumMatrix(int[][] matrix) {
//    -Напишите программу, которая принимает на вход двумерный
//    массив int[][] и возвращает сумму всех элементов в массиве.
        int sum = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                sum += elem;
            }
        }
        return sum;
    }

    public static int getMaxElemMatrix(int[][] matrix) {
//            -Напишите программу, которая принимает на вход двумерный массив
//    int[][] и возвращает максимальное значение среди всех элементов в массиве.
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem > max) {
                    max = elem;
                }
            }
        }
        return max;
    }

    public static HashSet<String> getUniqueStrings(String[] array) {
//            -Напишите программу, которая принимает массив строк String[] и
//    возвращает новый массив, содержащий только уникальные строки из исходного массива
        HashSet<String> uniqueSet = new HashSet<>();
        for (String str : array) {
            uniqueSet.add(str);
        }
        return uniqueSet;
    }

    public static String[] reverseStrings(String[] array) {
//-Напишите программу, которая принимает массив строк String[]
//    и возвращает новый массив строк, в котором все строки перевернуты задом наперёд.
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = reverseString(array[i]);
        }
        return reversedArray;

    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static Set<String> getStringStartWith(Set<String> strings) {
//-Напишите функцию, которая принимает на вход Set<String>
//    и возвращает новый Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.
        Set<String> set = new HashSet<>();
        for (String str : strings) {
            if (Character.isUpperCase(str.charAt(0))) {
                set.add(str);
            }
        }
        return set;
    }

    public static Set<String> getNewSetSameString(Set<String> set, Set<String> set1) {
//            -Напишите функцию, которая принимает на вход два Set<String> и
//    возвращает новый Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.
        Set<String> newSet = new HashSet<>();
        for (String str : set) {
            if (set1.contains(str)) {
                newSet.add(str);
            }
        }
        return newSet;
    }

    public static Set<String> getUniqueString(Set<String> set) {
//            - Напишите функцию, которая принимает на вход Set<String> и возвращает
//    новый Set<String>, содержащий только уникальные строки, игнорируя регистр символов
//    Set<String> stringSet = new HashSet<>();
//        stringSet.add("Apple");
//        stringSet.add("banana");
//        stringSet.add("apple");
//        stringSet.add("Banana");
        Set<String> set1 = new HashSet<>();
        for (String str:set) {
            if(Character.isLowerCase(str.charAt(0))){
                set1.add(str);
            }
        }
        return set1;
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        Map<String, Boolean> map = new HashMap<>();
        List<String> list = findFailedStudent(map);
        System.out.println(list);

        System.out.println("Task 2");
        int countNotAvailProduct = countNotAvailProduct();
        System.out.println(countNotAvailProduct);

        System.out.println("Task 3");
        findNameStartWithLetter();

        System.out.println("Task 4");
        findPariWords();

        System.out.println("Task 5");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getSum(array));

        System.out.println("Task 6");
        System.out.println(getAverage(array));

        System.out.println("Task 7");
        int[][] matrix = {
                {1, 2, 3,
                        4, 5, 6,
                        7, 8, 9}
        };
        System.out.println(getSumMatrix(matrix));

        System.out.println("Task 8");
        System.out.println(getMaxElemMatrix(matrix));

        System.out.println("Task 9");
        String[] strings = {"pizza", "food", "wednesday", "sunday", "pizza"};
        System.out.println(getUniqueStrings(strings));

        System.out.println("Task 10");
        System.out.println(Arrays.toString(reverseStrings(strings)));

        System.out.println("Task 11");
        Set<String> set = new HashSet<>();
        set.add("pizza");
        set.add("Sunday");
        set.add("tuesday");
        set.add("monday");
        set.add("sunday");
        set.add("Food");

        System.out.println(getStringStartWith(set));

        System.out.println("Task 12");
        Set<String> set1 = new HashSet<>();
        set1.add("sunday");
        set1.add("contains");
        set1.add("equals");
        set1.add("add");
        set1.add("remove");
        set1.add("monday");

        System.out.println(set + " " + set1);
        System.out.println(getNewSetSameString(set, set1));

        System.out.println("Task 13");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");
        System.out.println(stringSet);
        System.out.println(getUniqueString(stringSet));

    }
}

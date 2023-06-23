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
    public static boolean isReverse(String name1,String name2){
        StringBuilder reverseWord=new StringBuilder(name2).reverse();
        return name1.equals(reverseWord.toString());
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

    }
}

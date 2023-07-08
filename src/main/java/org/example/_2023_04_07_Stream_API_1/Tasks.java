package org.example._2023_04_07_Stream_API_1;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static void filterAndSortedReversed() {
        // Задача 1: Фильтрация чисел больше 5 и вывод в порядке убывания
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filterAndSorted = numbers.stream()
                .filter(el -> el > 5)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(filterAndSorted);
    }

    public static void upperCaseAndDel() {
        // Задача 2: Преобразование строк в верхний регистр и удаление дубликатов
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Apple", "Banana", "Cherry");
        List<String> toUpperCase = words.stream()
                .map(String::toUpperCase)
                .distinct()
                .toList();
        System.out.println(toUpperCase);

    }

    public static void quadratAndEven() {
        // Задача 3: Вывод квадратов чисел, удовлетворяющих условию четности числа
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> quadratAndEven = nums.stream()
                .filter(el -> el % 2 == 0)
                .map(num -> num * num)
                .toList();
        System.out.println(quadratAndEven);
    }

    public static void getSumEvenNum() {
        // Задача 4: Подсчет суммы четных чисел
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumEven = values.stream()
                .filter(el -> el % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumEven);
    }

    public static void convertString() {
        // Задача 5: Преобразование чисел в строки и объединение их с разделителем
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        String str = integers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" - "));
        System.out.println(str);
    }

    public static void getFirstEvenNum() {
        // Задача 6: Поиск первого четного числа
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> first = values.stream().filter(el -> el % 2 == 0).findFirst();
        first.ifPresent(value -> System.out.println("First -> " + value));
        System.out.println(first);
    }

    public static void findWordStartWithA() {
        //Дан список слов. Необходимо проверить, содержит ли он хотя бы одно слово, начинающееся с буквы "A".
//        strings.stream()
//                .filter(word -> {
//                    if (word.startsWith("A")) {
//                        System.out.println(word);
//                    }
//                    return false;
//                })
//                .forEach(System.out::println);

        // Задача 7: Проверка, все ли строки начинаются с буквы "A"
        List<String> list2 = Arrays.asList("Apple", "banana", "cherry", "Banana", "jasefaefnhauf");

        boolean c = list2.stream()
                .allMatch(word -> word.startsWith("A"));
        if (c) {
            System.out.println("List has words start with A");
        } else {
            System.out.println("List has not words start with A");
        }
    }

    public static void skipElem() {
// Задача 8: Пропуск первых 3 чисел и сумма оставшихся
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = values.stream()
                .mapToInt(Integer::intValue)
                .skip(3)
                .sum();
    }

    public static void getMinAndMaxNum() {
// Задача 9: Выбор минимального и максимального числа из листа
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalInt min = values.stream()
                .mapToInt(Integer::intValue)
                .min();
        OptionalInt max = values.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Min -> " + min);
        System.out.println("Max -> " + max);
    }

    public static void grouping() {
// Задача 10: Группировка слов по длине
        List<String> list2 = Arrays.asList("Apple", "banana", "cherry", "Banana", "jasefaefnhauf");
        Map<Integer, List<String>> group = list2.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(group);
    }

    public static void getAVG() {
// Задача 11: Подсчет среднего значения чисел
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalDouble avg = values.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(avg);
    }

    public static void findWordStartWitha() {
        // Задача 12: Поиск всех слов, содержащих букву "a"
        List<String> list2 = Arrays.asList("Apple", "banana", "cherry", "Banana", "jasefaefnhauf", "apple");
        boolean c = list2.stream()
                .anyMatch(word -> word.startsWith("a"));
        if (c) {
            System.out.println("List has words start with a");
        } else {
            System.out.println("List has not words start with a");
        }
    }

    public static void quadratAndSorted() {
// Задача 13: Преобразование чисел в квадрат и сортировка в обратном порядке
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> quadratAndSorted = values.stream()
                .map(num -> num * num)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(quadratAndSorted);
    }

    public static void binaryFormat() {
        // Задача 14: Преобразование чисел в двоичный формат и объединение в строку
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String binaryString = values.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.joining(" "));

        System.out.println(binaryString);
    }

    public static void filterToString() {
        // Задача 15: Фильтрация чисел, кратных 3, и преобразование их в строки
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> filterToString = values.stream()
                .filter(el->el%3==0)
                .map(Objects::toString)
                .toList();
        System.out.println(filterToString);
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        filterAndSortedReversed();

        System.out.println("Task 2");
        upperCaseAndDel();

        System.out.println("Task 3");
        quadratAndEven();

        System.out.println("Task 4");
        getSumEvenNum();

        System.out.println("Task 5");
        convertString();

        System.out.println("Task 6");
        getFirstEvenNum();

        System.out.println("Task 7");
        findWordStartWithA();

        System.out.println("Task 8");
        skipElem();

        System.out.println("Task 9");
        getMinAndMaxNum();

        System.out.println("Task 10");
        grouping();

        System.out.println("Task 11");
        getAVG();

        System.out.println("Task 12");
        findWordStartWitha();

        System.out.println("Task 13");
        quadratAndSorted();

        System.out.println("Task 14");
        binaryFormat();

        System.out.println("Task 15");
        filterToString();

    }
}

package org.example._2023_07_06_Stream_API_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void getUniqueEvenAndOddNum() {
        // Задача 1: Подсчет количества уникальных четных и нечетных чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Map<Boolean, Long> map = numbers.stream()
                .distinct()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));
        System.out.println(map);

        // long count = list.stream()
        //                .distinct()
        //                .filter(el -> el % 2 == 0)
        //                .count();
        //        long count1 = list.stream()
        //                .distinct()
        //                .filter(el -> el % 2 == 1)
        //                .count();
        //        System.out.println("Enum: " + count + "\nOdd: " + count1);
        //    }

    }

    public static void groupingFirstLetter() {
        //Задача 2: Группировка строк по первым буквам и вывод первых двух слов из каждой группы
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        Map<Character, List<String>> map = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        map.values().stream()
                .map(el -> el.stream().limit(2))
                .toList()
                .forEach(System.out::println);
        System.out.println(map);
    }

    public static void makeListToString() {
        //Задача 3: Преобразование списков в строку и удаление повторяющихся символов
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );
        String result = listOfLists.stream()
                .flatMap(List::stream)// Преобразование списков в один поток строк
                .distinct()
                .collect(Collectors.joining());// Преобразование потока в строку
        System.out.println(result);
    }

    public static void filterAndMulti() {
        //Задача 4: Фильтрация и умножение числа на 2
        List<Integer> numbers2 = Arrays.asList(1, 3, 2, 6, 4, 5, 7, 8, 9);
        List<Integer> list = numbers2.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();
        System.out.println(list);
    }

    public static void primeAndComposite() {
        //Задача 5: Разделение чисел на простые и составные
        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
        Map<Boolean, List<Integer>> map = numbers3.stream()
                .collect(Collectors.partitioningBy(Tasks::isPrime));
        System.out.println(map);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Задача 6: Получение уникальных символов из списка строк
    public static void getUniqueSymbol() {
        //Задача 6: Получение уникальных символов из списка строк
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> toSt = words2.stream()
                .map(el -> Arrays.asList(el.split("")))
                .flatMap(Collection::stream)
                .distinct()
                .toList();
        System.out.println(toSt);
    }

    //Задача 7: Разделение строк на отдельные слова и удаление повторений
    public static void uniqueString() {
        List<String> sentences = Arrays.asList("Hello world", "Java is awesome", "Stream API is powerful");
        List<String> strlist = sentences.stream()
                .flatMap(el -> Arrays.stream(el.split(" ")))
                .distinct()
                .toList();
        System.out.println(strlist);
    }

    //Задача 8: Фильтрация и преобразование строк toUpperCase
    public static void stringToUpperCase() {
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> upper = words3.stream()
                .filter(item -> item.contains("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(upper);
    }

    //Задача 9: Получение среднего значения чисел
    public static void getAvg() {
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        Double avg = numbers4.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);
    }

    //Задача 10: Получение списка квадратов чисел
    public static void getSquare() {
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers5.stream()
                .map(number -> number * number)
                .toList();
        System.out.println(square);
    }

    //Задача 11: Группировка строк по длине
    public static void groupingByLength() {
        List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> mapLength = words4.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapLength);
    }

    //Задача 12: Проверка, содержатся ли строки в списке
    public static void haveWordsInList(){
        List<String> words5 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> searchWords = Arrays.asList("banana", "fig", "grape");

        boolean bool = words5.stream()
                .anyMatch(searchWords::contains);
        System.out.println(bool);

    }

    //Задача 13: Поиск первой строки, удовлетворяющей условию
    public static void findFirstString() {
        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> first = words6.stream()
                .filter(el->el.contains("a"))
                .findFirst();
        System.out.println(first);
    }

    //Задача 14: Сокращение списка до указанного размера
    public static void limitList(int len) {
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> limit = numbers6.stream()
                .limit(len)
                .toList();
        System.out.println(limit);
    }

    //Задача 15: Объединение двух списков в один
    public static void concatenation() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> intList = Stream.concat(list1.stream(),list2.stream()) // a + b = ab
                .toList();
        System.out.println(intList);
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        getUniqueEvenAndOddNum();

        System.out.println("Task 2");
        groupingFirstLetter();

        System.out.println("Task 3");
        makeListToString();

        System.out.println("Task 4");
        filterAndMulti();

        System.out.println("Task 5");
        primeAndComposite();

        System.out.println("Task 6");
        getUniqueSymbol();

        System.out.println("Task 7");
        uniqueString();

        System.out.println("Task 8");
        stringToUpperCase();

        System.out.println("Task 9");
        getAvg();

        System.out.println("Task 10");
        getSquare();

        System.out.println("Task 11");
        groupingByLength();

        System.out.println("Task 12");
        haveWordsInList();

        System.out.println("Task 13");
        findFirstString();

        System.out.println("Task 14");
        limitList(5);

        System.out.println("Task 15");
        concatenation();

    }
}

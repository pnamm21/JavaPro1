package org.example._2023_06_29_Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Tasks {

    public static void filter(List<Integer> list) {
        //Дан список чисел. Необходимо отфильтровать только положительные числа и вывести их в отсортированном порядке.
        list.stream()
                .filter(el -> el > 0)
                .sorted()
                .forEach(System.out::println);
    }

    public static void upperCase(List<String> list) {
        //Дан список строк. Необходимо преобразовать каждую строку в верхний регистр, удалить повторяющиеся строки и вывести результат.
        list.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }

    class Person {
        //Person {
        //    String name
        //    int age
        //}
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    public static void filterPerson(List<Person> person) {
        //Дан список объектов Person. Необходимо отфильтровать только совершеннолетних людей, отсортировать по имени и вывести результат.
        person.stream()
                .filter(person1 -> person1.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }

    public static void getSum(List<Integer> numbers) {
        //Дан список чисел. Необходимо найти сумму всех четных чисел.

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма четных чисел: " + sum);
    }

    public static void getAVG(List<Integer> list) {
        //Дан список чисел. Необходимо найти среднее значение всех чисел. //average()
        OptionalDouble average = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println(average);

    }

    public static void findLongestWord(List<String> stringList) {
        //Дан список слов. Необходимо найти самое длинное слово.
        String b = stringList.stream()
                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                .orElse(" ");
        System.out.println("The longest word is -> " + b);
    }

    public static void skipFirstAndSecondElem(List<Integer> integerList) {
        //Дан список чисел. Необходимо пропустить первые два элемента и вывести остальные
        integerList.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    public static void findWordStartWithA(List<String> strings) {
        //Дан список слов. Необходимо проверить, содержит ли он хотя бы одно слово, начинающееся с буквы "A".
//        strings.stream()
//                .filter(word -> {
//                    if (word.startsWith("A")) {
//                        System.out.println(word);
//                    }
//                    return false;
//                })
//                .forEach(System.out::println);

        boolean c = strings.stream()
                .anyMatch(word -> word.startsWith("A"));
        if (c) {
            System.out.println("List has words start with A");
        } else {
            System.out.println("List has not words start with A");
        }
    }
    //Дан список строк. Необходимо объединить их в одну строку, разделенную запятой. //Collectors.joining()

    //Дан список объектов Person. Необходимо сгруппировать их по возрасту и вывести результат.
    public static void checkNumIsPositive(List<Integer> integers) {
        //Дан список чисел. Необходимо проверить, являются ли все числа положительными.
//        integers.stream()
//                .filter(num-> {
//                    if (num >= 0) {
//                        System.out.println("All numbers is positive");
//                    }
//                    return false;
//                })
//                .toList();

        boolean a = integers.stream()
                .allMatch(num -> num > 0);

        if (a) {
            System.out.println("All numbers is positive");
        } else {
            System.out.println("Have negative numbers");
        }
    }
    //Дан список чисел. Необходимо найти первое четное число.

    //Дан список чисел. Необходимо умножить все числа на заданное значение.
    public static void getSumLengthAllString(List<String> stringList) {
        //Дан список строк. Необходимо найти сумму длин всех строк.


    }
    //Дан список чисел. Необходимо преобразовать его в массив.

    public static void getString(List<String> strings) {
//    Дан список строк. Необходимо преобразовать каждую строку
//    в верхний регистр, удалить повторяющиеся строки и вывести результат.
        strings.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

    }

    public static void sortArray(List<Integer> list) {
//        Дан список чисел. Необходимо отфильтровать только
//        положительные числа и вывести их в отсортированном порядке.

        list.stream()
                .filter(el -> el > 0)
                .sorted()
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> list = Arrays.asList(12, -3, 45, 67, 8, 99);
        sortArray(list);

        System.out.println("Task 2");
        List<String> list1 = Arrays.asList("Apple", "banana", "cherry", "Banana");
        getString(list1);

        System.out.println("Task 3");
        List<String> list2 = Arrays.asList("Apple", "banana", "cherry", "Banana", "jasefaefnhauf");
        findLongestWord(list2);

        System.out.println("Task 4");
        skipFirstAndSecondElem(list);

        System.out.println("Task 5");
        findWordStartWithA(list2);

        System.out.println("Task 6");
        checkNumIsPositive(list);

    }
}

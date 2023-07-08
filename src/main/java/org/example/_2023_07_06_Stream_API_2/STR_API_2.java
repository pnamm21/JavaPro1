package org.example._2023_07_06_Stream_API_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class STR_API_2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("A", "A", 5000),
                new Employee("B", "B", 6000),
                new Employee("C", "C", 7000),
                new Employee("D", "D", 8000),
                new Employee("E", "E", 9000));

        // groupingBy
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(emp -> {
                    if (emp.getSalary() < 5000) {
                        return "Low";
                    } else if (emp.getSalary() < 6000) {
                        return "Medium";
                    } else {
                        return "High";
                    }
                }));
        for (Map.Entry<String, List<Employee>> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("_____________________________________");

        // dropWhile()
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<Integer> list1 = list.stream()
                .dropWhile(n -> n < 8)
                .toList();
        System.out.println(list1);
        System.out.println("_____________________________________");

        // groupingBy()
        List<String> list2 = Arrays.asList("apple", "banana", "cherry", "orange", "kiwi");
        Map<Integer, List<String>> map1 = list2.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map1);
        System.out.println("_____________________________________");

        // flatMap()
        List<String> sentences = Arrays.asList("Explain quantum computing in simple terms →");
        sentences.stream()
                .flatMap(el -> Arrays.stream(el.split(" ")))
                .map(String::toUpperCase)
                .toList();
        System.out.println(sentences);
        System.out.println("_____________________________________");

        // mapMulti()
        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(3);

        Stream.of(list3)
                .flatMap(List::stream)
                .mapMulti((number, consumer) -> {
                    consumer.accept(number * number);
                    consumer.accept(number * number * number);
                })
                .forEach(System.out::println);
        System.out.println("_____________________________________");

        // partitioningBy()
        List<String> list4 = Arrays.asList("apple", "banana", "cherry", "orange", "kiwi");
        Map<Boolean, List<String>> map2 = list4.stream()
                .collect(Collectors.partitioningBy(str -> str.length() <= 5));
        System.out.println(map2);
        System.out.println("_____________________________________");
        Map<Boolean, List<Employee>> map3 = employees.stream()
                .collect(Collectors.partitioningBy(salary -> salary.getSalary() <= 5));
        System.out.println(map3);
        System.out.println("_____________________________________");

        // takeWhile()
        List<Employee> employees11 = Arrays.asList(new Employee("A", "A", 5000),
                new Employee("B", "B", 6000),
                new Employee("C", "C", 7000),
                new Employee("D", "D", 8000),
                new Employee("E", "E", 9000));

        List<Employee> result = new ArrayList<>();
        employees11.stream()
                .unordered()
                .takeWhile(e -> e.getSalary() <= 6000)
                .forEach(result::add);
        System.out.println(result);
        System.out.println("_____________________________________");

        // unordered()
        List<Integer> list6 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        list6.stream().unordered();
        System.out.println(list6);



    }

    @Getter
    @ToString
    @AllArgsConstructor
    static class Employee {
        private String firstName;
        private String lastName;
        private int salary;
    }
}

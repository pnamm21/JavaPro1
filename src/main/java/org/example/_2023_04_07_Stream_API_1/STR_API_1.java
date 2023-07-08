package org.example._2023_04_07_Stream_API_1;

import java.util.*;
import java.util.stream.Collectors;

public class STR_API_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 2, 6, 8, 4, 6, 77, 53, 2, 10);

        // count
        long l = list.stream().count();
        System.out.println(l);
        System.out.println("--------------------------------");

        // max
        Optional<Integer> max = list.stream().max(Integer::compare);
        max.ifPresent(value -> System.out.println("Max -> " + value));
        System.out.println("--------------------------------");

        // min
        Optional<Integer> min = list.stream().min(Integer::compare);
        min.ifPresent(value -> System.out.println("Min -> " + value));
        System.out.println("--------------------------------");

        // findFirst
        Optional<Integer> first = list.stream().findFirst();
        first.ifPresent(value -> System.out.println("First -> " + value));
        System.out.println("--------------------------------");

        // findAny
        Optional<Integer> any = list.stream().findAny();
        any.ifPresent(item -> System.out.println("Any -> " + item));
        System.out.println("--------------------------------");

        // forEach
        System.out.println("ForEach: ");
        list.forEach(System.out::println);
        System.out.println("--------------------------------");

        // distinct
        System.out.println("Distinct: " + list.stream().distinct().toList());
        System.out.println("--------------------------------");

        // skip
        System.out.println("Skip: " + list.stream().sorted().skip(5).toList());
        System.out.println("--------------------------------");

        // peek
        System.out.println("Peek: " + list.stream().map(e -> e * 10).peek(System.out::println).map(e -> e / 10).toList());
        System.out.println("--------------------------------");

        // limit
        System.out.println("Limit: " + list.stream().limit(6).toList());
        System.out.println("--------------------------------");

        // toArray
        System.out.println("toArray: " + Arrays.toString(list.stream().toArray(Integer[]::new)));
        System.out.println("--------------------------------");

        // reduce
        System.out.println("Reduce: " + list.stream().reduce((acc, comb) -> acc + comb));
        System.out.println("--------------------------------");

        // collect
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("Set: "+set);
        System.out.println("--------------------------------");

        // mapToInt
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
        System.out.println("--------------------------------");

        // flatMap
        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(4, 5),
                Arrays.asList(5, 6)
        );
        List<Integer> y = groups.stream()
                        .flatMap(Collection::stream)
                                .toList();
        System.out.println(y);
        System.out.println("--------------------------------");


    }
}

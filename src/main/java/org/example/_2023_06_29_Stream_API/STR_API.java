package org.example._2023_06_29_Stream_API;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class STR_API {
    public static void main(String[] args) {
        // filter()
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // filter()

              List<Integer> list = numbers.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println(list);
        */

        // map()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // map()

        numbers.stream()
                .map(item -> item * 10)
                .forEach(el -> System.out.println(el));
         */

        // distinct()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // distinct()

        int f = numbers.stream()
                .map(el->{
                    if (el%2==0){
                        el=el*11;
                    }
                    return el;
                }).filter(el->el>100)
                .sorted()
                .distinct()
                .map(el->el/15)
                .sorted(Comparator.reverseOrder())
                .reduce((el1,el2)->el1-el2)
                .filter(el->el>0)
                .get();

        System.out.println(f);
        */

        // limit()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        List<Integer> a = new ArrayList<>();
        a.add(8888);
        // limit()

        List<Integer> list = numbers.stream()
                .sorted()
                .distinct()
                .filter(el->el%2==0)
                .limit(3)
                .toList();

        a.addAll(list);
        System.out.println(a);
        */

        // skip()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // skip()

        List<Integer> list = numbers.stream()
                .sorted()
                .distinct()
                .filter(el->el%2==0)
                .skip(3)
                .toList();

        System.out.println(list);
        */

        // allMatch()
        // anzMatch()
        // noneMatch()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // allMatch()

        boolean b = numbers.stream().allMatch(el->el>2);
        System.out.println(b);

        // anyMatch()
        boolean a = numbers.stream().anyMatch(el->el>2);
        System.out.println(a);

        // noneMatch()
        boolean c = numbers.stream().noneMatch(el->el>2);
        System.out.println(c);
        */

        // reduce()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // reduce()

        int reduce = numbers.stream()
                .reduce(1000, Integer::sum);
        System.out.println(reduce);
        */

        // collect()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // collect()

        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
        */

        // flatMap()
        /*List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 5, 1, 1, 6, 7, 8, 9);
        // flatMap()

        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(4, 5),
                Arrays.asList(5, 6)
        );

        List<Integer> list = groups.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list);
        */


    }

}

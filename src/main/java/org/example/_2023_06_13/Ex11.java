package org.example._2023_06_13;

import org.example._2023_06_08.POJO;

import java.util.*;

public class Ex11 {
    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> findDuplicates(List<String> list) {
        Set<String> uniqueElem = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (String str : list) {
            if (!uniqueElem.add(str)) {
                duplicates.add(str);
            }
        }
        return duplicates;
    }

    //Проверить, содержит ли List<String> заданную строку
    // и вернуть ее индекс. Если строка не найдена, вернуть -1.
    public static int findString(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    //Найти сумму всех элементов в Set<Integer>,
    // которые являются четными числами.
    public static int findSumEvenNum(Set<Integer> set) {
        int sum = 0;
        for (int num : set) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    //Проверить, содержит ли List<String> хотя бы
    // одну строку, которая начинается с заданного префикса.
    public static List<String> getPrefix(List<String> list, String prefix) {
        List<String> list1 = new ArrayList<>();
        for (String elem : list) {
            if (elem.startsWith(prefix)) {
                list1.add(elem);
            }
        }
        return list1;
    }

    //Получить все возможные комбинации из List<String> и Set<Integer>,
    //где каждая комбинация представляет собой строку и число, объединенные вместе
    public static List<String> getCombination(List<String> strings, Set<Integer> set) {
        List<String> combinations = new ArrayList<>();
        for (String str : strings) {
            for (Integer number : set) {
                String combination = str + number.toString();
                combinations.add(combination);
            }
        }
        return combinations;
    }

    //Перебрать и вывести все элементы Set<String> с использованием Iterator.
    public static void getAllElemIterator(Set<String> set) {
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String elem = iterator.next();
            System.out.println(elem);
        }

    }

    //Перебрать и вывести все элементы List<String> с использованием ListIterator в обратном порядке
    public static void getIteratorList(List<String> str){
        ListIterator<String> iterator= str.listIterator(str.size());
        while(iterator.hasPrevious()){
            String elem= (iterator.previous());
            System.out.println(elem);
        }
    }
    private void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 15) {
                System.out.println("!!!");
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("volvic");
        list.add("cola");
        list.add("fanta");
        list.add("cola");
        list.add("volvic");
        list.add("aqua");
        list.add("newaqua");

        Set<String> set = new HashSet<>();
        set.add("volvic");
        set.add("cola");
        set.add("fanta");
        set.add("cola");
        set.add("volvic");
        set.add("aqua");
        set.add("newaqua");

        int[] array = {2, 4, 1, 2, 7};


        for (int i = 0; i < 10; i++) {

        }
//             TYPE x = new 5(constructor)
        POJO pojo = new POJO("II", 11);
        pojo.setSalary(9999999);
        new POJO("WS", 654d).setSalary(123);

//        getIteratorList(list);

//        getAllElemIterator(set);

//        List<String> combinations = getCombination(set, set);
//        for (String combination:combinations) {
//            System.out.println(combination);
//        }

//        List<String> prefix = getPrefix(set, "co");
//        System.out.println(prefix);

//        System.out.println("Summa all even number: " + findSumEvenNum(set));

//        System.out.println(findString(set,"aqua"));

//        List<String> duplicates = findDuplicates(set);
//        System.out.println("Duplicates: "+duplicates);

    }
}

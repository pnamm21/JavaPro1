package org.example.dz_2023_06_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dz_Array_List_Set_Map {

    public static void getKeys(Map<Integer, String> map) {
        //        1.Вывести все ключи из мапы на экран.
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        for (Integer entry : map.keySet()) {
            System.out.println(entry);
        }
    }

    public static void haveValue(Map<Integer, String> map, String checkValue) {
        //        2.Проверить, содержит ли мапа определенное значение.
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        if (map.containsValue(checkValue)) {
            System.out.println("Map has value " + checkValue);
        } else {
            System.out.println("Map has not value " + checkValue);
        }
    }

    public static void haveKey(Map<String, Integer> map, int findValue) {
        //        3.Найти ключ, связанный с определенным значением.
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        String foundKey = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == findValue) {
                foundKey = entry.getKey();
                break;
            }
        }

        if (foundKey != null) {
            System.out.println("Found key for value -> " + findValue + ": " + foundKey);
        } else {
            System.out.println(" Not find key for value -> " + findValue);
        }
    }

    public static void findKeyThatValueStartWith(Map<Integer, String> map, String letter) {
        //        4.Вывести на экран все ключи, у которых значение начинается с определенной буквы.
        map.put(1, "mama");
        map.put(2, "drive");
        map.put(3, "football");
        map.put(4, "food");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            if (value.startsWith(String.valueOf(letter))) {
                System.out.println(key);
            }
        }
    }

    public static void haveThisKey(Map<Integer, String> map, int key) {
        //        5.Проверить, содержит ли мапа определенный ключ.
        map.put(1, "mama");
        map.put(2, "drive");
        map.put(3, "football");
        map.put(4, "food");

        if (map.containsKey(key)) {
            System.out.println("Map has this key: " + key);
        } else {
            System.out.println("Map has not this key: " + key);
        }
    }

    public static void findKeyWithMaxValueMap(Map<String, Integer> map) {
        //        6.Найти ключ с максимальным значением.
        map.put("A", 1);
        map.put("C", 3);
        map.put("B", 2);

        int max = Integer.MIN_VALUE;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("Key with biggest value is -> " + maxKey);
    }

    public static int countKeyThatValueTheSame(Map<Integer, String> map, String word) {
        //        7.Подсчитать количество ключей, значение которых содержит определенное слово.
        map.put(1, "mama");
        map.put(2, "drive");
        map.put(3, "football");
        map.put(4, "food");
        map.put(5, "food");
        map.put(6, "drive");
        int count = 0;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.contains(word)) {
                count++;
            }
        }
        return count;
    }

    public static void findKeyThatValueIsNum(Map<String, String> map) {
//        8.Найти все ключи, значение которых состоит только из цифр.
        map.put("A", "1");
        map.put("B", "B");
        map.put("C", "3");
        map.put("D", "4");
        map.put("E", "E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (isDigitValue(value)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static boolean isDigitValue(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void getSumNumInMap(Map<String, Integer> map) {
//        9.Подсчитать сумму числовых значений в мапе.
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 3);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer num = entry.getValue();
            sum += num;
        }
        System.out.println("Summa all number in the Map -> " + sum);
    }

    public static int getAmountOfKeyValueLength(Map<Integer,String> map,int length) {
//        10.Подсчитать количество ключей, у которых длина значения превышает определенную границу.
        map.put(1, "mama");
        map.put(2, "drive");
        map.put(3, "football");
        map.put(4, "food");
        map.put(5, "food");
        map.put(6, "drive");
        int count=0;
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            String value = entry.getValue();
            if (value.length() > length){
                count++;
            }
        }
        return count;
    }

    public static void isKeyValue(Map<Integer, String> map) {
//        11.Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        System.out.println(map);

        Map<String, Integer> map1 = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            map1.put(value, key);
        }
        System.out.println(map1);
    }

    public static void clearMap(Map<Integer, String> map) {
//        12.Очистить мапу и вывести сообщение о ее пустом состоянии.
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.clear();
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
        } else {
            System.out.println("Map is not Empty");
        }
    }

    public static void getValueList(List<Integer> list) {
//        13.Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void getValueReserveList(List<Integer> list) {
//        15.Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
        list.add(11);
        list.add(33);
        list.add(44);
        list.add(66);
        list.add(55);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static int getSumNum(int[] arr) {
//        16.Вычислить сумму всех элементов в массиве int[] и вывести результат.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void findMaxAndMin(int[] arr) {
//        17.Найти наименьший и наибольший элементы в массиве int[] и вывести их.
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }

            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max elem: " + max + "\n" + "Min elem: " + min);
    }

    public static void findEvenAndOdd(int[] arr) {
//        18.Подсчитать количество четных элементов в массиве int[] и вывести результат.
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            } else if (arr[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.println("Amount Even num: " + count + "\n" + "Amount Odd num: " + count1);
    }

    public static void sortArrayDecrease(int[] arr) {
//        19.Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        System.out.println("Successful sort: ");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void findSumKvadrat(int[] arr) {
        //        20.Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.
        int square = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            square = arr[i] * arr[i];
            sum += square;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        System.out.println("\n" + "Task 1");
        getKeys(map);
        System.out.println("\n" + "Task 2");
        haveValue(map, "G");
        haveValue(map, "A");
        System.out.println("\n" + "Task 3");
        haveKey(map1, 3);
        haveKey(map1, 6);
        System.out.println("\n" + "Task 4");
        findKeyThatValueStartWith(map, "m");
        System.out.println("\n" + "Task 5");
        haveThisKey(map, 7);
        System.out.println("\n" + "Task 6");
        findKeyWithMaxValueMap(map1);
        System.out.println("\n" + "Task 7");
        System.out.println(countKeyThatValueTheSame(map, "drive"));
        System.out.println("\n" + "Task 8");
        findKeyThatValueIsNum(map2);
        System.out.println("\n" + "Task 9");
        getSumNumInMap(map1);
        System.out.println("\n" + "Task 10");
        System.out.println(getAmountOfKeyValueLength(map, 4));
        System.out.println("\n" + "Task 11");
        isKeyValue(map);
        System.out.println("\n" + "Task 12");
        clearMap(map);
        System.out.println("\n" + "Task 13");
        getValueList(list);
        System.out.println("\n" + "Task 15");
        getValueReserveList(list1);
        System.out.println("\n" + "Task 16");
        System.out.println(getSumNum(arr));
        System.out.println("\n" + "Task 17");
        findMaxAndMin(arr);
        System.out.println("\n" + "Task 18");
        findEvenAndOdd(arr);
        System.out.println("\n" + "Task 19");
        sortArrayDecrease(arr);
        System.out.println("\n" + "Task 20");
        findSumKvadrat(arr);

    }
}

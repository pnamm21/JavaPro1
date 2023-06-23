package org.example._2023_06_06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Tasks_lesson {
    public static boolean isPalindrome(String text) {
        List<Character> characterList = new ArrayList<>();
        for (Character elem : text.toCharArray()) {
            characterList.add(elem);
        }
        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> iterator1 = characterList.listIterator(characterList.size());

        int center = characterList.size() / 2;
        int count = 0;

        while (iterator.hasNext() && (center > count)) {
            if (iterator.next() != iterator1.previous()) {
                return false;
            }
            count++;
        }

        return true;
    }

    public static boolean isPalindrome2(String strings) {
        return new StringBuilder(strings).reverse().toString().equals(strings);
//        StringBuilder stringBuilder = new StringBuilder(strings);
//        stringBuilder.reverse();
//        boolean stringtrue = false;
//        if (stringBuilder.toString().equals(strings)) {
//            stringtrue = true;
//        }
//        return stringtrue;
    }

    // dorabotat etot method!!!!!!!!
    public static int getUnique(int[] array) {
//        int unique = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    break;
//                } else {
//                    unique = array[i];
//                }
//            }
//        }
//        return unique;
        int unique = 0;
        boolean isUnique = true;

        for (int i = 0; i < array.length; i++) {
            isUnique = true;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique = array[i];
                break;
            }
        }

        return unique;
    }

    // posmotret chto method delaet!!!!!!!!
    public static int getUnique1(int[] array) {
        int sor = 0;
        for (int x : array) {
            sor ^= x;
        }
        return sor;
    }

    public static void main(String[] args) {
//        String strings = "madam";
//        System.out.println(isPalindrome(strings));
//        System.out.println(isPalindrome2(strings));

        int[] array = {11, 22, 33, 99, 11, 22, 33};
        System.out.println(getUnique1(array));
        System.out.println();
        System.out.println(getUnique(array));
        }

    }


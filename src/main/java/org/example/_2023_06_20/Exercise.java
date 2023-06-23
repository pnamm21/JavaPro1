package org.example._2023_06_20;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static int countWords(String[] words) {
        //    Напишите метод countWords(String[] words),
//    который будет принимать
//    массив строк words и возвращать количество слов в массиве.
//    Для решения задачи используйте метод split() класса String,
//    который разделяет строку на подстроки на основе заданного разделителя (пробела).
//    Подсчитайте количество полученных подстрок и верните результат.

        int count = 0;
        for (String word : words) {
            String[] split = word.split(" ");
            count += split.length;
        }
        return count;
    }

    public static String findLongestWord(String[] words) {
//        Напишите метод findLongestWord(String[] words),
//        который будет принимать массив строк words и возвращать
//        самое длинное слово из массива. Для решения задачи используйте переменную
//        для хранения текущего самого длинного слова и обновляйте ее при нахождении
//        более длинного слова в массиве.
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static List<String> findWordsStartingWithLetter(List<String> words, char letter) {
//        Напишите метод findWordsStartingWithLetter(List<String> words, char letter),
//        который будет принимать список строк words и символ letter, и возвращать новый
//        список, содержащий только те слова из исходного списка, которые начинаются с
//        заданной буквы letter. Используйте цикл for-each для перебора элементов списка
//        и условие startsWith() класса String для проверки начальной буквы.

        List<String> newList = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(String.valueOf(letter))) {
                newList.add(word);
            }
        }
        return newList;
    }


    public static void main(String[] args) {
        List<String> oldList = new ArrayList<>();
        oldList.add("mama");
        oldList.add("drive");
        oldList.add("football");
        oldList.add("food");

        String[] words = {"mama football food"};
        String[] words1 = {"mama", "football", "food"};

        System.out.println("Task 1");
        System.out.println(countWords(words) + " words");
        System.out.println("Task 2");
        System.out.println(findLongestWord(words1));
        System.out.println("Task 3");
        char letter = 'f';
        List<String> newList = findWordsStartingWithLetter(oldList, letter);
        System.out.println("Words start with letter " + letter + ": " + newList);
        System.out.println("Task 4");

    }

}

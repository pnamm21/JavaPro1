package org.example._2023_06_20;

import java.util.*;

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

    public static String concatenateStrings(List<String> words) {
//        Напишите метод concatenateStrings(List<String> words),
//        который будет принимать список строк words и объединять их
//        в одну строку, разделяя каждое слово пробелом. Для решения
//        задачи используйте переменную для хранения результирующей строки
//        и цикл for-each, чтобы перебрать элементы списка и добавить их к
//        результирующей строке.
        StringBuilder wordResult = new StringBuilder();
        for (String value : words) {
            wordResult.append(value).append(" ");
        }
        if (wordResult.length() > 0) {
            wordResult.deleteCharAt(wordResult.length() - 1);
        }
        return wordResult.toString();
    }

    public static int calculateMatrixSum(int[][] matrix) {
//        Напишите метод calculateMatrixSum(int[][] matrix),
//        который будет принимать двумерный массив matrix и возвращать
//        сумму всех элементов матрицы. Для решения задачи используйте два
//        вложенных цикла for для перебора элементов матрицы и суммируйте их значения.
        int sum = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                sum += elem;
            }
        }
        return sum;
    }

    public static int findMaxNumInMatrix(int[][] matrix) {
//    Напишите метод findMaximumInMatrix(int[][] matrix),
//    который будет принимать двумерный массив matrix и возвращать максимальное
//    значение из всех элементов матрицы. Для решения задачи используйте переменную
//    для хранения текущего максимального значения и обновляйте ее при нахождении более
//    большого значения в матрице.
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int elem : row) {
                if (max < elem) {
                    max = elem;
                }
            }
        }
        return max;
    }

    public static void printKeyAndValueMap(Map<Integer, String> map) {
//    Напишите метод printMapEntries(Map<Integer, String> map),
//    который будет принимать карту map и выводить на экран все пары
//    ключ-значение, используя цикл for-each для перебора элементов карты.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void findKeyByValue(Map<Integer, String> map, String value) {
//    Напишите метод findKeyByValue(Map<Integer, String> map, String value),
//    который будет принимать карту map и строку value, и возвращать ключ,
//    соответствующий заданному значению. Для решения задачи используйте цикл
//for-each для перебора элементов карты и условие equals() класса String для
//    сравнения значений.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value1 = entry.getValue();
            if (value1.equals(value)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        List<String> oldList = new ArrayList<>();
        oldList.add("mama");
        oldList.add("drive");
        oldList.add("football");
        oldList.add("food");
        oldList.add("food");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

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
        System.out.println(concatenateStrings(oldList));
        System.out.println("Task 5");
        int[][] matrix = {
                {2, 2, 3},
                {4, 10, 6},
                {7, 1, 9}
        };
        System.out.println(calculateMatrixSum(matrix));
        System.out.println("Task 6");
        System.out.println(findMaxNumInMatrix(matrix));
        System.out.println("Task 7");
        printKeyAndValueMap(map);
        System.out.println("Task 8");
        findKeyByValue(map, "C");
    }

    static class Client implements Comparable<Client> {
// - класс Клиент
//    - имя
//    - возраст
//    - номер паспорта
//    - лист банковских карт

        private String name;
        private int age;
        private int passportNumber;
        private List<BankCard> bankCards;

        public Client(String name, int age, int passportNumber) {
            this.name = name;
            this.age = age;
            this.passportNumber = passportNumber;
            this.bankCards = new ArrayList<>();
        }

        public void addCard(BankCard... bankCards) {
            // iter bankCards
            for (BankCard card : bankCards) {
                this.bankCards.add(card);
            }
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

        public int getPassportNumber() {
            return passportNumber;
        }

        public void setPassportNumber(int passportNumber) {
            this.passportNumber = passportNumber;
        }

        public void setBankCards(List<BankCard> bankCards) {
            this.bankCards = bankCards;
        }

        @Override
        public int compareTo(Client o) {
            return 0;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", passportNumber=" + passportNumber +
                    ", bankCards=" + bankCards +
                    '}';
        }
    }

    static class BankCard {
// - класс Банковская карта -- class
//    - срок действия       -- String
//    - статус              -- enum
//    - платежная система   -- enum
//    - остаток на счету    -- double
//    - валюта              -- enum

        private String name;
        private int expirationDate;
        private Status status;
        private PaymentSystem paymentSystem;
        private double accountBalance;
        private Currency currency;

        public BankCard(String name, int expirationDate, Status status, PaymentSystem paymentSystem, double accountBalance, Currency currency) {
            this.name = name;
            this.expirationDate = expirationDate;
            this.status = status;
            this.paymentSystem = paymentSystem;
            this.accountBalance = accountBalance;
            this.currency = currency;
        }

        // region Getter & Setter

        public int getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(int expirationDate) {
            this.expirationDate = expirationDate;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public PaymentSystem getPaymentSystem() {
            return paymentSystem;
        }

        public void setPaymentSystem(PaymentSystem paymentSystem) {
            this.paymentSystem = paymentSystem;
        }

        public double getAccountBalance() {
            return accountBalance;
        }

        public void setAccountBalance(double accountBalance) {
            this.accountBalance = accountBalance;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "BankCard{" +
                    "name='" + name + '\'' +
                    ", expirationDate='" + expirationDate + '\'' +
                    ", status=" + status +
                    ", paymentSystem=" + paymentSystem +
                    ", accountBalance=" + accountBalance +
                    ", currency=" + currency +
                    '}';
        }

        // endregion

        enum Status {
            Blocked,
            Debit,
            Gold,
            Silver,
            Expired, Active;
        }

        enum PaymentSystem {
            Apple_pay,
            Swift,
            Paypal;
        }

        enum Currency {
            USD,
            EUR,
            UAH;
        }
    }

    class Storage {
//    - класс Хранилище
//    - мапа которая хранит ---Клиент, ЛистКарт--- TreeMap
//         * Add -- {Клиент, ЛистКарт}
//         * Read(валюта)
//         * Update
//         * Delete

        Map<Client, List<BankCard>> storage = new TreeMap<>();

        public void add(Client client, List<BankCard> bankCard) {
            storage.put(client, bankCard);
        }

        public List<BankCard> read(BankCard.Currency currency) {
            List<BankCard> bankCards = new ArrayList<>();
            for (Map.Entry<Client, List<BankCard>> entry : storage.entrySet()) {
                for (BankCard card : entry.getValue()) {
                    if (card.getCurrency() == currency) {
                        bankCards.add(card);
                    }
                }
            }
            return bankCards;
        }

        public void update(Client client, List<BankCard> bankCards) {
            if (storage.containsKey(client)) {
                storage.put(client, bankCards);
            } else {
                System.out.println("Client not found!");
            }
        }

        public void delete(Client client, List<BankCard> bankCards) {
            if (storage.containsKey(client)) {
                storage.remove(client, bankCards);
            } else {
                System.out.println("Client not found!");
            }
        }

    }

    static class Generator {
// - класс Генератор
//         * генерация Клиента
//         * генерация банковских карт

        private static String[] names = {"Vanessa", "Elis", "Vasya", "Vanya", "Victor", "Tolik", "Vitya"};
        private static int[] ages = {27, 12, 51, 13, 36, 61, 22};
        private static int[] passportNumbers = {1132102, 1201231, 5532378, 2233445, 7846523, 4521345, 3353412};

        public static List<Client> generateClient() {
            List<Client> list = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                Client client = new Client(names[i], ages[i], passportNumbers[i]);
                list.add(client);
            }
            return list;
        }

        private static Random random = new Random();
        private static BankCard.PaymentSystem[] paymentSystems = {BankCard.PaymentSystem.Paypal, BankCard.PaymentSystem.Swift, BankCard.PaymentSystem.Apple_pay};
        private static BankCard.Currency[] currencies = {BankCard.Currency.USD, BankCard.Currency.EUR, BankCard.Currency.UAH};

        public static List<BankCard> generateBankCard(int amount) {
            List<BankCard> bankCardsList = new ArrayList<>();

            for (int i = 0; i < names.length; i++) {
                String name = Arrays.toString(names);
                int expDate = generateExpDate();
                BankCard.Status status = BankCard.Status.Active;
                BankCard.PaymentSystem paymentSystem = getPaySys();
                double accBalance = generateAccBalance();
                BankCard.Currency currency = getCurrency();
                BankCard bankCard = new BankCard(name, expDate, status, paymentSystem, accBalance, currency);
            }
            return bankCardsList;
        }

        private static int generateExpDate() {
            return random.nextInt();
        }

        private static BankCard.PaymentSystem getPaySys() {
            int idx = random.nextInt(paymentSystems.length);
            return paymentSystems[idx];
        }

        private static BankCard.Currency getCurrency() {
            int idx = random.nextInt(currencies.length);
            return currencies[idx];
        }

        private static double generateAccBalance() {
            return random.nextDouble();
        }

    }

    static class Main1 {
// - класс Мэйн


        public static void main(String[] args) {

        }

    }
}




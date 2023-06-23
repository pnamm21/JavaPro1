package org.example.dz_2023_06_06;

import java.util.*;

public class write1 {
    public static int[] getArrayToNewArray(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : array) {
            set.add(n);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int n : set) {
            newArray[index++] = n;
        }
        return newArray;
    }

    public static HashSet<Character> getUniqueElem(String strings) {
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for (int i = 0; i < strings.length(); i++) {
            char ch = strings.charAt(i);
            uniqueCharacters.add(Character.toLowerCase(ch));
        }
        return uniqueCharacters;
    }

    public static boolean findOddNum(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : array) {
            set.add(n);
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 3, 2, 1, 6, 3, 2, 7};
//        int[] newArray = getArrayToNewArray(array);
//        int[] odd = {1,3,5,7,9};
//        int[] even = {2,14,4,5,7,5,8,6};
//        System.out.println(Arrays.toString(newArray));
//        String strings = "animAls wOrk";
//        HashSet<Character> set = getUniqueElem(strings);
//        System.out.println(set);
//        System.out.println(findOddNum(odd)+" - not found even number");
//        System.out.println(findOddNum(even)+" - found even number");

//        main1();
//        main2();
//        main3();
//        main4();
        main5();

    }

    public static void main1() {
        Set<Person> set = new HashSet<>();
        Person person1 = new Person("Rayana", 25);
        Person person2 = new Person("Nam", 16);
        Person person3 = new Person("Said", 23);
        Person person4 = new Person("Bogdan", 25);
        Person person5 = new Person("Egor", 36);
        Person person6 = new Person("Ksenia", 22);
        Person person7 = new Person("Anna", 26);

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);
        set.add(person6);
        set.add(person7);

        System.out.println(set);
        System.out.println("================================");
        System.out.println(person2.compareTo(person1));

    }

    public static void main2() {
        Set<Book> set = new HashSet<>();
        Book b1 = new Book("The Midnight Guardian", "Emily Carter", 2012);
        Book b2 = new Book("Echoes of the Past", "Michael Anderson", 2018);
        Book b3 = new Book("Whispering Shadows", "Samantha Collins", 2007);
        Book b4 = new Book("The Art of Reflection", "Benjamin Hughes", 2015);
        Book b5 = new Book("A New Dawn", "Olivia Roberts", 2003);

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);

        System.out.println(set);
        System.out.println("====================================");
        System.out.println(b2.compareTo(b5));
    }

    public static void main3() {
        Set<Product> set = new HashSet<>();
        Product product1 = new Product("SwiftBlade Pro", 149.99);
        Product product2 = new Product("LunaScent Diffuser", 69.99);
        Product product3 = new Product("AquaGuard 2000", 79.99);
        Product product4 = new Product("TechBreeze Wireless Earbuds", 129.99);
        Product product5 = new Product(" EcoTrek Solar Power Bank", 49.99);

        set.add(product1);
        set.add(product2);
        set.add(product3);
        set.add(product4);
        set.add(product5);

        System.out.println(set);
        System.out.println("====================================");
        System.out.println(product2.compareTo(product3));

    }

    public static void main4() {
        Set<Student> set = new HashSet<>();
        Student student1 = new Student("John Doe", 85);
        Student student2 = new Student(" Emily Smith", 92);
        Student student3 = new Student(" Michael Johnson", 78);
        Student student4 = new Student("Sarah Davis", 89);
        Student student5 = new Student(" David Wilson", 95);

        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);

        System.out.println(set);
        System.out.println("====================================");
        System.out.println(student1.compareTo(student2));
    }

    public static void main5() {
        Set<Country> set = new HashSet<>();
        Country country1 = new Country("Solara", 32517901);
        Country country2 = new Country("Aquilonia", 14209876);
        Country country3 = new Country("Verdantis", 5982345);
        Country country4 = new Country("Novaria", 23761204);
        Country country5 = new Country("Zephyria", 8432109);

        set.add(country1);
        set.add(country2);
        set.add(country3);
        set.add(country4);
        set.add(country5);

        System.out.println(set);
        System.out.println("====================================");
        System.out.println(country2.compareTo(country4));

    }
}

// in main1
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.getAge();
    }
}

//in main2
class Book implements Comparable<Book> {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.publicationYear - o.getPublicationYear();
    }

}

// int main3
class Product implements Comparable<Product> {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}

// in main4
class Student implements Comparable<Student> {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return this.grade - o.grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

// in main5
class Country implements Comparable<Country> {

    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public int compareTo(Country o) {
        return this.population - o.population;
    }
}



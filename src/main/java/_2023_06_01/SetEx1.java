package _2023_06_01;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
       Set<Student> set = new HashSet<>();
        Student s1 = new Student("Rayana", 25, 3);
        Student s2 = new Student("Nam", 16, 5);
        Student s3 = new Student("Said", 23, 1);
        Student s4 = new Student("Bogdan", 25, 2);
        Student s5 = new Student("Egor", 36, 3);
        Student s6 = new Student("Ksenia", 22, 4);
        Student s7 = new Student("Anna", 26, 5);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);

//        Collections.sort(list,new StudentAgeComparator());

        System.out.println(set);
    }
}

//у КЛАССА есть ПОЛЯ
//Der Postman bring Post
class Student implements Comparable<Student> {
    String name;
    int age;
    int course;


    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name + '/' +
                "age=" + age + '/' +
                "course=" + course + '/';
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }
}
class StudentAgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}



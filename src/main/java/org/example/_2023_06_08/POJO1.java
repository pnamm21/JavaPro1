package org.example._2023_06_08;

import java.util.*;

public class POJO1 implements Comparable<POJO1> {
    private String name;
    private String address;
    private String sex;
    private int age;
    private int dateOfBirth;

    public POJO1(String name, String address, String sex, int age, int dateOfBirth) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "POJO1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(POJO1 o) {
        return this.age - o.age;
    }
}

class Main2 {
    public static void main(String[] args) {
        TreeSet<POJO1> set = new TreeSet<>();
        POJO1 pojo1 = new POJO1("Vasya", "pushkin", "m", 23, 2000);
        POJO1 pojo2 = new POJO1("Vanya", "pushkir", "m", 24, 1999);
        POJO1 pojo3 = new POJO1("Lera", "pushk", "f", 18, 2004);
        POJO1 pojo4 = new POJO1("Sergei", "pijhghkin", "m", 33, 1990);
        POJO1 pojo5 = new POJO1("Renat", "renist", "f", 30, 1993);
        POJO1 pojo6 = new POJO1("Nikita", "nikarea", "m", 20, 2003);
        POJO1 pojo7 = new POJO1("Anton", "alima", "m", 45, 1978);
        POJO1 pojo8 = new POJO1("Aleksei", "rokonet", "m", 26, 1993);
        POJO1 pojo9 = new POJO1("Lena", "marew", "f", 29, 1994);
        POJO1 pojo0 = new POJO1("Vasya", "pushkin", "m", 23, 2000);

        set.add(pojo1);
        set.add(pojo2);
        set.add(pojo3);
        set.add(pojo4);
        set.add(pojo5);
        set.add(pojo6);
        set.add(pojo7);
        set.add(pojo8);
        set.add(pojo9);
        set.add(pojo0);

        System.out.println(set);

        List<POJO1> myList = new ArrayList<>();
        Iterator<POJO1> pojo1Iterator = set.iterator();
        while (pojo1Iterator.hasNext()) {
            POJO1 pojo11 = pojo1Iterator.next();
            if (pojo11.getAge() > 30) {
                myList.add(pojo11);
            }
        }
        for (POJO1 pojo : myList) {
            System.out.println(pojo.getName() + " - " + pojo.getAge());
        }
    }

}


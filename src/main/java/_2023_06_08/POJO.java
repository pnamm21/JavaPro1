package _2023_06_08;

import java.util.Objects;

public class POJO {
    private String name;
    private String surname;
    private  int age;
    private double salary;

    public POJO(String surname, double salary) {
        this.surname = surname;
        this.salary = salary;
    }

    public POJO(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POJO pojo = (POJO) o;
        return age == pojo.age && Double.compare(pojo.salary, salary) == 0 && Objects.equals(name, pojo.name) && Objects.equals(surname, pojo.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary);
    }

    public static void main(String[] args) {
        POJO pojo =new POJO("T",222);
        pojo.setSalary(1);
        System.out.println(pojo);
    }
}

package org.example._2023_06_22_Structure1;

import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

public class EX2_class {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John",Department.CODING,Position.JUNIOR,2000);
        Employee employee2 = new Employee("Bogdan",Department.CODING,Position.SENIOR,5000);
        Employee employee3 = new Employee("Nam",Department.CODING,Position.HR,5250);



    }
}

/*
- Company
    - name
    - Set<Employee>
    - Set<Department>

- Employee
    - name
    - Department(энам)
    - Position(энам)
    - double salary

- Info
    - Map<Position, List<String>>
    - checker() - на вход сотруника, на выходе String в зависимости от позишн
    - avgSalaryDep() - на вход Set<Employee>, Department, на выход средняя зп по департаменту
    - maxSalary() - на вход Set<Employee>, Department, на выход max зп по департаменту + у кого такая зп(имя)
    - minSalary() - на вход Set<Employee>, Department, на выход min зп по департаменту + у кого такая зп(имя)
    - getPromotion() - на вход сотрудника. в методе - засетить переход на одну позицию выше и зп на 25% больше.
*/
@Getter
@Setter
@AllArgsConstructor
class Company {

    // fields
    // private methods
    // constructor
    // other methods
    // get-set-toString-implements

    private String name;
    private Set<Employee> employeeSet;
    private Set<Department> departmentSet;

    // lombok constructor

    public void addEmployee(Employee employee) {
        employeeSet.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeSet.remove(employee);
    }

    // lombok getter-setter

}

@Getter
@Setter
@AllArgsConstructor
class Employee {
    private String name;
    private Department department;
    private Position position;
    private double salary;

    // lombok constructor


    // lombok getter-setter
}

class Info {
    private static Map<Position, List<String>> positionListMap = new HashMap<>() {
        {
            put(Position.JUNIOR, Arrays.asList("писать код"));
            put(Position.MIDDLE, Arrays.asList("писать код", "дебажить"));
            put(Position.SENIOR, Arrays.asList("писать код", "дебажить", "учить"));
            put(Position.ARCHITECT, Arrays.asList("решение теории", "озадачивание"));
            put(Position.HR, Arrays.asList("найм", "зарплата"));
        }
    };

    private static List<Double> getSalaryEmployees(Set<Employee> employees, Department department){
        List<Double> salaryEmployees = employees.stream()
                .filter(employee -> employee.getDepartment()==department)
                .map(Employee::getSalary)
//                .mapToDouble(Double::doubleValue)
                .toList();
        return salaryEmployees;
    }


    // на вход сотруника, на выходе String в зависимости от позишн
    public static String checker(Employee employee) {
        Position position = employee.getPosition();
        List<String> list = positionListMap.get(position);
        return String.join(", ",list);
    }

    // на вход Set<Employee>, Department, на выход средняя зп по департаменту
    public double avgSalaryDep(Set<Employee> employees, Department department) {
        List<Double> list = getSalaryEmployees(employees,department);
        double avg = list.stream().mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        return avg;
    }

    // на вход Set<Employee>, Department, на выход max зп по департаменту + у кого такая зп(имя)
    public double maxSalary(Set<Employee> employees, Department department) {
        List<Double> list = getSalaryEmployees(employees,department);
        double maxSa = list.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
        return maxSa;
    }

    // на вход Set<Employee>, Department, на выход min зп по департаменту + у кого такая зп(имя)
    public double minSalary(Set<Employee> employees, Department department) {
        List<Double> list = getSalaryEmployees(employees,department);
        double minSa = list.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(0.0);
        return minSa;
    }

    // на вход сотрудника. в методе - засетить переход на одну позицию выше и зп на 25% больше.
    public void getPromotion(Employee employee) {
        switch (employee.getPosition()){
            case JUNIOR -> {
                employee.setPosition(Position.MIDDLE);
                employee.setSalary(employee.getSalary() * 1.25);
            }
            case MIDDLE -> {
                employee.setPosition(Position.SENIOR);
                employee.setSalary(employee.getSalary() * 1.25);
            }
            case SENIOR -> {
                employee.setPosition(Position.ARCHITECT);
                employee.setSalary(employee.getSalary() * 1.25);
            }
            case ARCHITECT -> {
                employee.setPosition(Position.HR);
                employee.setSalary(employee.getSalary() * 1.25);
            }
            case HR -> employee.setSalary(employee.getSalary() * 1.10);
        }
    }

}

enum Department {
    MARKETING,
    SALES,
    FINANCE,
    CODING,
    HIRING;
}

enum Position {
    JUNIOR,
    MIDDLE,
    SENIOR,
    ARCHITECT,
    HR;
}


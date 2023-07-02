package org.example._2023_06_22_Structure1;
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

import java.util.*;

public class Company {
    private String name;
    private Set<Employee> employeesSet;
    private Set<Department> departmentSet;

    public Company(String name, Set<Employee> employeesSet, Set<Department> departmentSet) {
        this.name = name;
        this.employeesSet = employeesSet;
        this.departmentSet = departmentSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployeesSet() {
        return employeesSet;
    }

    public void setEmployeesSet(Set<Employee> employeesSet) {
        this.employeesSet = employeesSet;
    }

    public Set<Department> getDepartmentSet() {
        return departmentSet;
    }

    public void setDepartmentSet(Set<Department> departmentSet) {
        this.departmentSet = departmentSet;
    }
}

enum Department {
    Marketing,
    Sales,
    Finance;
}

enum Position {
    Worker,
    Manager,
    Secretary,
    Director;
}

class Employee {
    private String name;
    private Department department;
    private Position position;
    private double salary;

    public Employee(String name, Department department, Position position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Info {
    private Map<Position, List<String>> positionInfoList;

    public Info() {
        positionInfoList = new HashMap<>();
    }

    public void addPositionInfo(Position position, List<String> infoList) {
        positionInfoList.put(position, infoList);
    }

    public String checker(Employee employee) {
        Position position = employee.getPosition();
        List<String> list = positionInfoList.get(position);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        } else {
            return "Dont have info about employee";
        }
    }

    public int avgSalaryDep(Set<Employee> employees, Department department) {
        int sum = 0, count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        }
        return 0;
    }

    public double maxSalary(Set<Employee> employees, Department department) {
        double maxSalary = Integer.MIN_VALUE;
        String employeeName = " ";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeName = employee.getName();
            }
        }
        System.out.println("Employee with the highest salary in " + department + ": " + employeeName);
        return maxSalary;
    }

    public double minSalary(Set<Employee> employees, Department department) {
        double minSalary = Integer.MAX_VALUE;
        String employeeName = " ";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeName = employee.getName();
            }
        }
        System.out.println("Employee with the smallest salary in " + department + ": " + employeeName);
        return minSalary;
    }



}

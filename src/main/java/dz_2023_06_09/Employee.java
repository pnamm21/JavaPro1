package dz_2023_06_09;

import java.util.*;

class Dz {
    public static void main(String[] args) {
        Employee employee = new Employee("Ian Green", "Salary", 32, 4500);
        Employee employee2 = new Employee("Ebony Guerrero", "Salary", 19, 2550);
        Employee employee3 = new Employee("Adnan Day", "Salary", 21, 3800);
        Employee employee4 = new Employee("Rex Levy", "Salary", 41, 5000);
        Employee employee5 = new Employee("Poppy Cunningham", "Salary", 20, 4450);
        Employee employee6 = new Employee("Abbey Stephens", "Salary", 35, 1480);
        Employee employee7 = new Employee("Carter Sutherland", "Salary", 40, 2450);
        Employee employee8 = new Employee("Aayan Bennett", "Salary", 39, 450);

        Generator generator = new Generator();
        List<Employee> employees = generator.getEmployeeList(employee, employee2, employee3, employee4, employee5, employee6, employee7, employee8);
        System.out.println(employees);

        DataBase dataBase = new DataBase();
        dataBase.addEmployee(employees);
        dataBase.printDataBase(employees);
        System.out.println(employees);

    }
}

class Employee {

    private String name;
    private String department;

    private int age;

    private int salary;

    public Employee(String name, String department, int age, int salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Generator {
    public List<Employee> getEmployeeList(Employee... employees) {
        List<Employee> list = new ArrayList<>(Arrays.asList(employees));
        return list;
    }
}


class DataBase {
    private Map<Integer, Employee> dataBase;

    public DataBase() {
        dataBase = new TreeMap<>();
    }

    public void addEmployee(List<Employee> list) {
        int key = 1;
        for (Employee employee : list) {
            dataBase.put(key++, employee);
        }
    }

    public void printDataBase(List<Employee> employees) {
        for (Map.Entry<Integer, Employee> entry : dataBase.entrySet()) {
//            System.out.println(entry);
            System.out.print(entry.getKey());
            System.out.println("\t"+entry.getValue());
        }
    }


}

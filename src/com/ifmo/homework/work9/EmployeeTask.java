package com.ifmo.homework.work9;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeGenerator(20);
        System.out.println(employees);
        Comparator<Employee> comparator = new Employee.nameComparator().thenComparing(new Employee.salaryComparator().thenComparing(new Employee.ageComparator().thenComparing(new Employee.companyComparator())));
        TreeSet<Employee> sortList = new TreeSet<>(comparator);
        for (Employee employee : employees) {
            sortList.add(employee);
        }
        System.out.println(sortList);
        // Дописать метод employeeGenerator и
        // отсортировать его по:
        // имени
        // имени и зарплате
        // имени, зарплате, возрасту и компании
    }
}

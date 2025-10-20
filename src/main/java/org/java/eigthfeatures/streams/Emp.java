package org.java.eigthfeatures.streams;

import java.util.*;
import java.util.stream.Collectors;



public class Emp {
    public static void main(String[] args) {
        //List<Employee> emps=Employee.createDummyEmployees();
        //Map<String, Long> collected = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //System.out.println(collected);
        List<Integer> l=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,4,5,6));
        //l.stream().filter(x->x%2==0).forEach(System.out::println);
        //System.out.println(l.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        List<String> s=new ArrayList<>(List.of("one","two","three","four","five","six","seve","eight"));
        s.add(null);
        //s.stream().map(String::toUpperCase).forEach(System.out::println);
        //Map<Integer, List<String>> collected = s.stream().collect(Collectors.groupingBy(String::length));
        //System.out.println(collected);
        //boolean matchFound = s.stream().anyMatch(str -> str.startsWith("o"));
        //System.out.println(matchFound);
        //List<String> list = collected.values().stream().flatMap(a -> a.stream()).toList();
        //System.out.println(list);
        HashSet<Integer> set=new HashSet<>();
        //l.stream().filter(i->!set.add(i)).forEach(System.out::println);
        s.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private double salary;
    private int age;
    private String department;

    public Employee(String name, double salary, int age, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return name + " | " + salary + " | " + age + " | " + department;
    }

    // Static method to create dummy employees
    public static List<Employee> createDummyEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 55000, 28, "IT"));
        employees.add(new Employee("Bob", 48000, 35, "HR"));
        employees.add(new Employee("Charlie", 72000, 40, "Finance"));
        employees.add(new Employee("David", 85000, 45, "IT"));
        employees.add(new Employee("Eva", 60000, 32, "Marketing"));
        employees.add(new Employee("Frank", 50000, 29, "IT"));
        employees.add(new Employee("Grace", 70000, 38, "Finance"));
        employees.add(new Employee("Hannah", 65000, 31, "HR"));
        employees.add(new Employee("Ian", 90000, 50, "Management"));
        employees.add(new Employee("Jack", 30000, 22, "Intern"));
        employees.add(new Employee("Karen", 55000, 27, "Marketing"));
        employees.add(new Employee("Leo", 48000, 26, "Intern"));
        employees.add(new Employee("Mona", 77000, 37, "Finance"));
        employees.add(new Employee("Nate", 88000, 42, "Management"));
        employees.add(new Employee("Olivia", 53000, 30, "HR"));
        employees.add(new Employee("Peter", 47000, 28, "IT"));
        employees.add(new Employee("Quinn", 61000, 34, "Marketing"));
        employees.add(new Employee("Rachel", 59000, 33, "HR"));
        employees.add(new Employee("Steve", 80000, 41, "Finance"));
        employees.add(new Employee("Tina", 95000, 47, "Management"));

        return employees;
    }
}

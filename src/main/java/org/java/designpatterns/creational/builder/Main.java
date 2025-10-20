package org.java.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Student student=Student.builder()
                .id(1)
                .age(21)
                .name("student")
                .build();

        System.out.println(student.toString());
    }
}

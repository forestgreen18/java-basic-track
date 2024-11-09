package com.illiakornyk.student;

public class Student {
    private final String name;
    private final int age;
    private final int studentId;
    private final double gpa;
    private final String major;

    public Student(String name, int age, int studentId, double gpa, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        this.major = major;
    }
}

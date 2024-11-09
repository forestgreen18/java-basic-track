package com.illiakornyk.student;
import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                studentId == student.studentId &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(major, student.major);
    }


}

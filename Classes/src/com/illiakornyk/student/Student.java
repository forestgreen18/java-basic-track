package com.illiakornyk.student;

import java.util.Objects;

/**
 * Represents a student with various attributes such as name, age, student ID, GPA, and major.
 * This class provides methods to perform operations like sorting and searching.
 */
public class Student {
    /**
     * The name of the student
     */
    private final String name;

    /**
     * The age of the student
     */
    private final int age;

    /**
     * The unique student ID
     */
    private final int studentId;

    /**
     * The student's GPA
     */
    private final double gpa;

    /**
     * The major subject of the student
     */
    private final String major;

    /**
     * Constructs a Student instance with specified attributes.
     *
     * @param name      the name of the student
     * @param age       the age of the student
     * @param studentId the unique ID of the student
     * @param gpa       the GPA of the student
     * @param major     the major of the student
     */
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

    /**
     * Compares this Student object with the specified Student object for equality.
     *
     * @param o the object to compare this Student against
     * @return true if the given object represents a Student with the same attributes; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age &&
                studentId == student.studentId &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(major, student.major);
    }

    /**
     * Returns a hash code value for this Student object.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, studentId, gpa, major);
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                '}';
    }

}

package com.illiakornyk.matrixoperations;

public class MatrixOperations {

    private int studentId;

    public MatrixOperations(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void calculateCValues() {
        int C5 = studentId % 5;
        int C7 = studentId % 7;
        int C11 = studentId % 11;


        System.out.println("C5 (studentId % 5): " + C5);
        System.out.println("C7 (studentId % 7): " + C7);
        System.out.println("C11 (studentId % 11): " + C11);
    }

    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8);
        System.out.println("Order number: " + matrixOps.getStudentId());


        matrixOps.calculateCValues();
    }
}

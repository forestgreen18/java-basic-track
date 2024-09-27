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

    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8); // Set studentId
        System.out.println("Order number: " + matrixOps.getStudentId()); // Get studentId
    }
}

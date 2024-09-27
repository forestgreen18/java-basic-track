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

        performBitwiseXor();
    }

    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8);
        System.out.println("Order number: " + matrixOps.getStudentId());

        matrixOps.calculateCValues();
    }


    private void performBitwiseXor() {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] ^ B[i][j];
            }
        }

        System.out.println("Resulting matrix C (A XOR B):");
        printMatrix(C);
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

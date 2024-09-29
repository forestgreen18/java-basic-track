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

        performBitwiseXor();
    }

    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8);
        System.out.println("Order number: " + matrixOps.getStudentId());

        matrixOps.calculateCValues();
    }


    private void performBitwiseXor() {
        byte[][] A = {
                {1, 2},
                {3, 4}
        };

        byte[][] B = {
                {5, 6},
                {7, 8}
        };

        byte[][] C = new byte[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = (byte) (A[i][j] ^ B[i][j]);
            }
        }

        System.out.println("Resulting matrix C (A XOR B):");
        printMatrix(C);
    }

    private void printMatrix(byte[][] matrix) {
        for (byte[] row : matrix) {
            for (byte value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

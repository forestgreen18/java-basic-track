package com.illiakornyk.matrixoperations;

public class MatrixOperations {

    private int studentId;
    private byte[][] A;
    private byte[][] B;
    private byte[][] C;


    public MatrixOperations(int studentId) {
        this.studentId = studentId;

        A = new byte[][] {
                {1, 2},
                {3, 4}
        };

        B = new byte[][] {
                {5, 6},
                {7, 8}
        };

        C = new byte[A.length][A[0].length];
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

        try {
            performBitwiseXor();

            calculateRowAverages();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8);
        System.out.println("Order number: " + matrixOps.getStudentId());

        matrixOps.calculateCValues();
    }

    private void performBitwiseXor() throws Exception {
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new Exception("Matrices A and B must have the same dimensions");
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = (byte) (A[i][j] ^ B[i][j]);
            }
        }

        System.out.println("Resulting matrix C (A XOR B):");
        printMatrix(C);
    }

    private void calculateRowAverages() {
        System.out.println("Average value for each row:");
        for (int i = 0; i < C.length; i++) {
            int sum = 0;
            for (int j = 0; j < C[i].length; j++) {
                sum += C[i][j];
            }
            double average = (double) sum / C[i].length;
            System.out.println("Row " + (i + 1) + " average: " + average);
        }
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

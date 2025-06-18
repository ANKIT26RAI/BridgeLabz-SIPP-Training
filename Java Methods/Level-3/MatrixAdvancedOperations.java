package com.studyopedia.JavaMethods.Level3;

import java.util.Scanner;

public class MatrixAdvancedOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = createRandomMatrix(rows, cols);
        System.out.println("Matrix:");
        displayMatrix(matrix);
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));
        if (rows == 2 && cols == 2) {
            System.out.println("Determinant (2x2): " + determinant2x2(matrix));
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("Inverse (2x2):");
                displayMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (determinant is 0)");
            }
        }
        if (rows == 3 && cols == 3) {
            System.out.println("Determinant (3x3): " + determinant3x3(matrix));
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("Inverse (3x3):");
                displayMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (determinant is 0)");
            }
        }
        scanner.close();
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0-9
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0)
            return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0)
            return null;
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[j][i] = cofactor3x3(m, i, j) / (double) det;
            }
        }
        return inv;
    }

    public static int cofactor3x3(int[][] m, int row, int col) {
        int[][] minor = new int[2][2];
        int r = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row)
                continue;
            c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col)
                    continue;
                minor[r][c] = m[i][j];
                c++;
            }
            r++;
        }
        int sign = ((row + col) % 2 == 0) ? 1 : -1;
        return sign * determinant2x2(minor);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}
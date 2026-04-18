package problem5;

import java.util.Scanner;

public class MatrixMultiplication {

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double[][] m1 = readMatrix(input, 3, 3);

        System.out.print("Enter matrix2: ");
        double[][] m2 = readMatrix(input, 3, 3);

        double[][] result = multiplyMatrix(m1, m2);

        displayResult(m1, m2, result);
    }

    private static double[][] readMatrix(Scanner sc, int rows, int cols) {
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }

    private static void displayResult(double[][] m1, double[][] m2, double[][] result) {
        System.out.println("The multiplication of the matrices is");
        for (int i = 0; i < m1.length; i++) {
            printRow(m1[i]);
            System.out.print(i == 1 ? "  * " : "     ");

            printRow(m2[i]);
            System.out.print(i == 1 ? "  =  " : "     ");

            printRow(result[i]);
            System.out.println();
        }
    }

    private static void printRow(double[] row) {
        for (double val : row) {
            System.out.printf("%-5.1f ", val);
        }
    }
}

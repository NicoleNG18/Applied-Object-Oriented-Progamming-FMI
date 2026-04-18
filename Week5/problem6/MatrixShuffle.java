package problem6;

import java.util.Random;
import java.util.Arrays;

public class MatrixShuffle {

    public static void shuffle(int[][] m) {
        Random random = new Random();

        for (int i = 0; i < m.length; i++) {
            int j = random.nextInt(m.length);

            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }
     static void main() {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println("Before shuffle:");
        printMatrix(m);

        shuffle(m);

        System.out.println("\nAfter shuffle:");
        printMatrix(m);
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}

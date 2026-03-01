package math;

import java.util.Scanner;

public class MathCalculationsTest {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: ");
        double x = input.nextDouble();

        double result = MathCalculations.calculateExp(x);

        System.out.printf("Calculated e^%.2f ≈ %.4f%n", x, result);
    }
}

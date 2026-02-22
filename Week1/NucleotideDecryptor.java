package problem4;

import java.util.Scanner;

public class NucleotideDecryptor {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four-digit number: ");
        int number = scanner.nextInt();

        String resultString = "";

        while (number > 0) {
            int currDigit = number % 4;
            resultString = convertNumberDigit(currDigit) + resultString;
            number /= 4;
        }

        System.out.printf("The nucleotide code is: %s%n", resultString);
    }

    private static String convertNumberDigit(int digit) {
        return switch (digit) {
            case 0 -> "A";
            case 1 -> "C";
            case 2 -> "G";
            case 3 -> "T";
            default -> "";
        };
    }
}
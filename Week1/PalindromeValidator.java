package problem2;

import java.util.Scanner;

public class PalindromeValidator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a five-digit number: ");
            number = scanner.nextInt();

            if (number < 10000 || number > 99999) {
                System.out.println("Invalid number!");
            }
        } while (number < 10000 || number > 99999);

        int originalNumber = number;

        int fifthDigit = number % 10;
        number /= 10;
        int fourthDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        String resultString;
        if (firstDigit == fifthDigit && thirdDigit == secondDigit) {
            resultString = "The number is palindrome";
        } else {
            resultString = "The number is not palindrome";
        }

        System.out.println(resultString);
    }
}

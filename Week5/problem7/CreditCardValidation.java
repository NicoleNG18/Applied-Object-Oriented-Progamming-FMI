package problem7;

import java.util.Scanner;

public class CreditCardValidation {
     static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");

        String s = input.next();
        char[] digits = s.toCharArray();

        if (isValid(digits)) {
            System.out.println(new String(digits) + " is valid");
        } else {
            System.out.println(new String(digits) + " is invalid");
        }
    }

    public static boolean isValid(char[] digits) {
        int size = digits.length;

        if (size < 13 || size > 16) return false;

        if (!startsWithValidPrefix(digits)) return false;

        int totalSum = sumOfDoubleEvenPlace(digits) + sumOfOddPlace(digits);

        return totalSum % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(char[] digits) {
        int sum = 0;
        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int d = Character.getNumericValue(digits[i]);
            sum += getDigit(d * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) return number;
        return (number / 10) + (number % 10);
    }

    public static int sumOfOddPlace(char[] digits) {
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(digits[i]);
        }
        return sum;
    }

    public static boolean startsWithValidPrefix(char[] digits) {
        int first = Character.getNumericValue(digits[0]);
        int second = Character.getNumericValue(digits[1]);

        if (first == 4) return true;
        if (first == 5) return true;
        if (first == 6) return true;
        if (first == 3 && second == 7) return true;

        return false;
    }
}

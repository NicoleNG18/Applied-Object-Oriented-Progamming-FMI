package problem6;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayUtils {
    static void filterNumbers(Predicate<Integer> condition, int[] array) {
        String text = Arrays.stream(array)
                .boxed()
                .filter(condition)
                .map(number -> Integer.toString(number))
                .collect(Collectors.joining(", "));
        System.out.printf("%s%n%n", text);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 51);
        }
        Predicate<Integer> predicate1 = number -> number % 2 == 0;
        System.out.printf("Even numbers: %n");
        filterNumbers(predicate1, numbers);
        Predicate<Integer> predicate2 = number -> number >= 30 && number <= 40;
        System.out.printf("From 30 to 40: %n");
        filterNumbers(predicate2, numbers);
        Predicate<Integer> predicate3 = ArrayUtils::isPrime;
        System.out.printf("Prime numbers: %n");
        filterNumbers(predicate3, numbers);
    }
}

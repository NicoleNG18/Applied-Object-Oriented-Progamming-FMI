package problem1;

import java.util.Scanner;

public class TemperatureConverter {

    static void main() {
        // a)
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the temperature in Fahrenheit: ");
//
//        double fahrenheit = scanner.nextDouble();
//        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
//
//        System.out.printf("Celsius: %.2f%n", celsius);

        // b)
//        System.out.println("Please enter the temperature in Celsius: ");
//
//        double celsius = scanner.nextDouble();
//        double fahrenheit = 9.0 / 5.0 * celsius + 32;
//
//        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);

        //c)
        System.out.println("""
                    1. Fahrenheit -> Celsius
                    2. Celsius -> Fahrenheit
                Enter choice:
                """);

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter the temperature in Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);

            System.out.printf("Celsius: %.2f%n", celsius);
        } else if (choice == 2) {

            System.out.println("Please enter the temperature in Celsius: ");

            double celsius = scanner.nextDouble();
            double fahrenheit = 9.0 / 5.0 * celsius + 32;

            System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

package computeByMenu;

import java.util.Scanner;

public class ComputeByMenu {

    private double x;
    //doing it as a class variable to be accessible from where is needed(more than 1 method)
    private final Scanner scanner;

    ComputeByMenu(double x) {
        this.scanner = new Scanner(System.in);
        setX(x);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void displayMenu() {
        System.out.print("""
                1. Update the floating point number
                2. Compute and display exp(x)
                3. Compute and display sin(x)
                4. Compute and display floor(x)
                5. Exit
                """);
    }

    public void doSelection(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.print("Enter new value for x: ");
                this.x = scanner.nextDouble();
                System.out.println("Value updated.");
            }
            case 2 -> {
                System.out.printf("exp(x) = %.2f%n", Math.exp(this.x));
            }
            case 3 -> {
                System.out.printf("sin(x) = %.2f%n", Math.sin(this.x));
            }
            case 4 -> {
                System.out.printf("floor(x) = %.2f%n", Math.floor(this.x));
            }
            case 5 -> {
                System.out.println("Exiting");
            }
            default -> System.out.println("Invalid selection. Please try again.");
        }
    }

    public int getUserChoice() {
        int userChoice;
        do {
            displayMenu();
            userChoice = scanner.nextInt();
            doSelection(userChoice);
        } while (userChoice != 5);
        return userChoice;
    }
}

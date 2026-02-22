package problem5;

public class CharacterRepresentation {
    static void main() {
        printUppercaseLetters();
        printLowercaseLetters();
        printDigits();
        printSymbols();
    }

    private static void printUppercaseLetters() {
        System.out.printf("A: %d%n", (int) 'A');
        System.out.printf("B: %d%n", (int) 'B');
        System.out.printf("C: %d%n", (int) 'C');
    }

    private static void printLowercaseLetters() {
        System.out.printf("a: %d%n", (int) 'a');
        System.out.printf("b: %d%n", (int) 'b');
        System.out.printf("c: %d%n", (int) 'c');
    }

    private static void printDigits() {
        System.out.printf("0: %d%n", (int) '0');
        System.out.printf("1: %d%n", (int) '1');
        System.out.printf("2: %d%n", (int) '2');
    }

    private static void printSymbols() {
        System.out.printf("$: %d%n", (int) '$');
        System.out.printf("*: %d%n", (int) '*');
        System.out.printf("+: %d%n", (int) '+');
        System.out.printf("/: %d%n", (int) '/');
        System.out.printf("blank: %d%n", (int) ' ');
    }
}
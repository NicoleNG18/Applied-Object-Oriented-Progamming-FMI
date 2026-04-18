package rational;

public class Main {
     static void main() {

        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(1, -2);
        Rational rDefault = new Rational();

        System.out.println("r1 (2/4): " + r1);
        System.out.println("r2 (1/-2): " + r2);
        System.out.println("Default: " + rDefault);

        Rational a = new Rational(1, 3);
        Rational b = new Rational(1, 6);

        System.out.println("\nOperations with " + a + " and " + b + ":");
        System.out.println("Sum: " + a.add(b));
        System.out.println("Difference: " + a.subtract(b));
        System.out.println("Product: " + a.multiply(b));
        System.out.println("Division: " + a.divide(b));

        System.out.println("\nTesting SET methods on r1:");
        r1.setNumerator(10);
        r1.setDenominator(20);
        System.out.println("r1 after setting 10/20: " + r1);
    }
}

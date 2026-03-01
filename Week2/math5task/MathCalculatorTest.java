package math5task;

public class MathCalculatorTest {
    static void main() {
        MathCalculator mc = new MathCalculator();
        double epsilon = 0.000001;

        System.out.println("Test PI:");
        mc.calculateAndTabulatePi();

        System.out.println("Test SIN(PI/6) [30 deg]:");
        double mySin = mc.calculateSin(Math.PI/6, epsilon);
        System.out.printf("My Sin: %.6f | Math.sin: %.6f%n", mySin, Math.sin(Math.PI/6));

        System.out.println("Test E^1:");
        double myE = mc.calculateE(1, epsilon);
        System.out.printf("My E: %.6f | Math.E: %.6f%n", myE, Math.E);
    }
}

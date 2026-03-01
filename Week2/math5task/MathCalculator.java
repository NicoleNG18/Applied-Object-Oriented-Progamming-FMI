package math5task;

public class MathCalculator {

    public void calculateAndTabulatePi() {
        double pi = 0;
        long n = 0;

        boolean found314 = false, found3141 = false, found31415 = false;

        while (pi <= 3.14159) {
            double term = 4.0 / (2 * n + 1);

            if (n % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }

            if (n < 20) {
                System.out.printf("%d\t\t%.10f%n", n + 1, pi);
            }

            if (!found314 && String.format("%.2f", pi).equals("3.14")) {
                System.out.printf(">>> Got 3.14 with %d chars.%n", n + 1);
                found314 = true;
            }

            n++;
            if (n > 1000000) break;
        }

        System.out.printf("Final value: %.10f%n %diterations.%n", pi, n);
    }

    public double calculateE(double x, double epsilon) {
        double sum = 1.0;
        double curr = 1.0;
        int counter = 1;

        while (Math.abs(curr) >= epsilon) {
            curr *= (x / counter);
            sum += curr;
            counter++;
        }
        return sum;
    }

    public double calculateSin(double x, double epsilon) {
        double sum = x;
        double curr = x;
        int counter = 1;

        while (Math.abs(curr) >= epsilon) {
            curr *= -1 * x * x / ((2.0 * counter) * (2.0 * counter + 1));
            sum += curr;
            counter++;
        }
        return sum;
    }

    public double calculateCos(double x, double epsilon) {
        double sum = 1.0;
        double curr = 1.0;
        int counter = 1;

        while (Math.abs(curr) >= epsilon) {
            curr *= -1 * x * x / ((2.0 * counter - 1) * (2.0 * counter));
            sum += curr;
            counter++;
        }
        return sum;
    }
}

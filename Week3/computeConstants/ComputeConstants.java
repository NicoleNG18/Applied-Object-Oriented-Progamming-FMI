package computeConstants;

public class ComputeConstants {

    //  3a
    public double calculateE(int iter) {
        double e = 1.0;
        double currValue = 1.0;

        for (int i = 1; i <= iter; i++) {
            currValue /= i;
            e += currValue;
        }
        return e;
    }

    // 3b
    public void calculatePi() {
        double pi = 0;
        long n = 0;
        long denominator = 1;

        boolean reached314 = false;
        boolean reached3141 = false;
        boolean reached31415 = false;

        System.out.println("Pi tabulation: ");

        while (true) {
            if (n % 2 == 0) {
                pi += 4.0 / denominator;
            } else {
                pi -= 4.0 / denominator;
            }

            if (!reached314 && Math.abs(pi) >= 3.14 && Math.abs(pi) < 3.15) {
                System.out.printf("Reached 3.14 at: %d%n", n + 1);
                reached314 = true;
            }
            if (!reached3141 && Math.abs(pi) >= 3.141 && Math.abs(pi) < 3.142) {
                System.out.printf("Reached 3.141 at: %d%n", n + 1);
                reached3141 = true;
            }
            if (!reached31415 && Math.abs(pi) >= 3.1415 && Math.abs(pi) < 3.1416) {
                System.out.printf("Reached 3.1415 at: %d%n", n + 1);
                reached31415 = true;
            }

            if (pi >= 3.14159 && pi < 3.141591) {
                System.out.printf("Final PI: %.6f reached at %d.%n", pi, n + 1);
                break;
            }

            denominator += 2;
            n++;


            if (n > 1000000) break;
        }
    }

    // 3c
    public double calculateSin(double x) {
        double sum = x;
        double currValue = x;
        int iterCount = 1;

        while (Math.abs(currValue) >= 0.001) {
            currValue *= -(x * x) / ((2 * iterCount) * (2 * iterCount + 1));
            sum += currValue;
            iterCount++;
        }
        return sum;
    }
    
    public double calculateCos(double x) {
        double sum = 1.0;
        double currValue = 1.0;
        int iterCount = 1;

        while (Math.abs(currValue) >= 0.001) {
            currValue *= -(x * x) / ((2 * iterCount - 1) * (2 * iterCount));
            sum += currValue;
            iterCount++;
        }
        return sum;
    }

    static void main() {
        ComputeConstants cc = new ComputeConstants();

        System.out.printf("e =  %.10f%n%n", cc.calculateE(20));

        cc.calculatePi();
        System.out.println();

        double angle = Math.toRadians(30);
        System.out.printf("sin(30°): %.4f (Math.sin: %.4f)%n", cc.calculateSin(angle), Math.sin(angle));
        System.out.printf("cos(30°): %.4f (Math.cos: %.4f)%n", cc.calculateCos(angle), Math.cos(angle));
    }
}
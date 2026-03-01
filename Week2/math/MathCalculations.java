package math;

public class MathCalculations {

        public static double calculateExp(double x) {
            double sum = 1.0;
            double curr = 1.0;
            int counter = 1;

            while (Math.abs(curr) >= 0.001) {
                curr *= (x / counter);
                sum += curr;
                counter++;
            }

            return sum;
        }
}

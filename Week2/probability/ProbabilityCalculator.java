package probability;

public class ProbabilityCalculator {

         static void main() {
            int totalInRange = 0;
            int favorableCount = 0;

            for (int i = 10000; i <= 99999; i++) {
                if (matchesDigitConstraints(i)) {
                    totalInRange++;

                    if (isDivisibleBy12(i)) {
                        favorableCount++;
                    }
                }
            }

            double probability = (totalInRange == 0) ? 0 : (double) favorableCount / totalInRange;

            System.out.println(String.format("Count with the intervals:\t%d", totalInRange));
            System.out.println(String.format("Count dev by 12:\t\t%d", favorableCount));
            System.out.println(String.format("Probability:\t\t\t\t%.4f", probability));
        }

        public static boolean matchesDigitConstraints(int n) {
            int d1 = n / 10000;
            int d2 = (n / 1000) % 10;
            int d3 = (n / 100) % 10;
            int d4 = (n / 10) % 10;
            int d5 = n % 10;

            return checkD1(d1) && checkD2(d2) && checkD3(d3) && checkD4(d4) && checkD5(d5);
        }

        private static boolean checkD1(int d) { return d >= 3 && d <= 9; }
        private static boolean checkD2(int d) { return d >= 2 && d <= 8; }
        private static boolean checkD3(int d) { return d >= 4 && d <= 9; }
        private static boolean checkD4(int d) { return d >= 1 && d <= 6; }
        private static boolean checkD5(int d) { return d >= 6 && d <= 9; }

        private static boolean isDivisibleBy12(int n) {
            return n % 12 == 0;
        }
}
package permutations;

import java.util.Arrays;
import java.util.Random;

public class PermutationGenerator {

    private static int rowCount = 0;

     static void main() {
        int[] nums = generateRandomDigits(4);
        Arrays.sort(nums);

        System.out.println("Input Array: " + Arrays.toString(nums));

        int totalUnique = calculateTotalUniquePermutations(nums);

        int[][] resultMatrix = new int[totalUnique][nums.length];
        rowCount = 0;

        generate(nums, new int[nums.length], new boolean[nums.length], 0, resultMatrix);

        System.out.println("Permutations Matrix (" + totalUnique + " rows):");
        for (int[] row : resultMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void generate(int[] nums, int[] current, boolean[] used, int depth, int[][] result) {
        if (depth == nums.length) {
            System.arraycopy(current, 0, result[rowCount++], 0, nums.length);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current[depth] = nums[i];

            generate(nums, current, used, depth + 1, result);

            used[i] = false;
        }
    }

    private static int calculateTotalUniquePermutations(int[] nums) {
        int n = nums.length;
        int total = factorial(n);

        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                total /= factorial(count);
                count = 1;
            }
        }
        total /= factorial(count);
        return total;
    }

    private static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    private static int[] generateRandomDigits(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }
}
package problem4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
         static void main() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter list1: ");
            int[] list1 = readArray(input);

            System.out.print("Enter list2: ");
            int[] list2 = readArray(input);

            int[] mergedList = merge(list1, list2);

            System.out.println("The merged list is " + Arrays.toString(mergedList).replaceAll("[\\[\\],]", ""));
        }

        private static int[] readArray(Scanner sc) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }

        public static int[] merge(int[] list1, int[] list2) {
            int[] result = new int[list1.length + list2.length];

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < list1.length && j < list2.length) {
                if (list1[i] <= list2[j]) {
                    result[k++] = list1[i++];
                } else {
                    result[k++] = list2[j++];
                }
            }

            while (i < list1.length) {
                result[k++] = list1[i++];
            }
            while (j < list2.length) {
                result[k++] = list2[j++];
            }

            return result;
        }
    }
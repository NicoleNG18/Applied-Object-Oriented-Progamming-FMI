package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

    public static <E extends Comparable<E>> E max(E[][] list) {
        E maxEl = list[0][0];

        for (E[] es : list) {
            E newMax = Collections.max(Arrays.asList(es));

            if (newMax.compareTo(maxEl) > 0) {
                maxEl = newMax;
            }
        }

        return maxEl;
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> resArray = new ArrayList<>();
        for (E curr : list) {
            if (Collections.frequency(resArray, curr) == 0) {
                resArray.add(curr);
            }
        }
        return resArray;
    }

    static void main() {
        Integer[][] matrix = {
                {1, 2, 3, 4, 4, 3, 9},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        System.out.printf("max %d%n", max(matrix));

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(matrix[0]));
        shuffle(arrayList);
        System.out.printf("shuffled %s%n", arrayList);

        System.out.printf("max list: %d%n", max(arrayList));

        ArrayList<Integer> mewArr = removeDuplicates(arrayList);

        System.out.printf("remove duplicates: %s%n", mewArr);
    }

}

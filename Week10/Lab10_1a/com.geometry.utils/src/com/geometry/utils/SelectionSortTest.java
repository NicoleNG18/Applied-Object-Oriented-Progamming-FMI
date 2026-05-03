package com.geometry.utils;

import com.geometry.types.Circle;
import com.geometry.types.Cylinder;
import com.geometry.types.Point;

import java.util.Arrays;
import java.util.Random;

import static com.geometry.utils.SelectionSort.sortArray;

public class SelectionSortTest {

    private static final Comparable[] arrComparable = new Comparable[9];

    static void main() {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(10, 51);
            int y = random.nextInt(10, 51);

            Point point = new Point(x, y);
            arrComparable[i] = point;
        }

        for (int i = 3; i < 6; i++) {
            Point point = (Point) arrComparable[i - 3];
            int x = point.getX();
            int y = point.getY();
            int radius = random.nextInt(10, 51);

            Circle circle = new Circle(x, y, radius);
            arrComparable[i] = circle;
        }

        for (int i = 6; i < 9; i++) {
            Circle circle = (Circle) arrComparable[i - 3];
            int x = circle.getX();
            int y = circle.getY();
            int radius = circle.getRadius();
            int height = random.nextInt(10, 60);

            Cylinder cylinder = new Cylinder(x, y, radius, height);
            arrComparable[i] = cylinder;
        }

        System.out.printf("Unsorted array: %s \n ", Arrays.toString(arrComparable));

        SelectionSort.sortArray(arrComparable);

        System.out.printf("\nSorted array: %s \n ", Arrays.toString(arrComparable));
    }
}

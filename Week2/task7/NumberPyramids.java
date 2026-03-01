package task7;

public class NumberPyramids {

     static void main() {
        drawPattern1(9);
        drawPattern2(9);
        drawPattern3(9);
        drawPattern4(8);
        drawPattern5(9);
        drawPattern6(9);
    }

    public static void drawPattern1(int rows) {
        System.out.println("Pattern 1");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(i + "   ");
            System.out.println();
        }
    }

    public static void drawPattern2(int rows) {
        System.out.println("Pattern 2");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void drawPattern3(int rows) {
        System.out.println("Pattern 3");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void drawPattern4(int rows) {
        System.out.println("Pattern 4");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void drawPattern5(int rows) {
        System.out.println("Pattern 5");
        for (int i = rows; i >= 1; i--) {
            for (int s = 0; s < rows - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void drawPattern6(int rows) {
        System.out.println("Pattern 6");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print("  ");
            int startNum = rows - i + 1;
            for (int j = startNum; j <= rows; j++) System.out.print(j + " ");
            for (int j = rows - 1; j >= startNum; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}
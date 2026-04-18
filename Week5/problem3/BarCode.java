package problem3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BarCode {
    private static final int[][] CODE_TABLE = {
            {0, 0, 0, 1, 1}, // 1
            {0, 0, 1, 0, 1}, // 2
            {0, 0, 1, 1, 0}, // 3
            {0, 1, 0, 0, 1}, // 4
            {0, 1, 0, 1, 0}, // 5
            {0, 1, 1, 0, 0}, // 6
            {1, 0, 0, 0, 1}, // 7
            {1, 0, 0, 1, 0}, // 8
            {1, 0, 1, 0, 0}, // 9
            {1, 1, 0, 0, 0}  // 0
    };

    private String digitToBarcode(int digit) {
        int index = (digit == 0) ? 9 : digit - 1;

        return Arrays.stream(CODE_TABLE[index])
                .mapToObj(bit -> bit == 0 ? ":" : "|")
                .collect(Collectors.joining());
    }

    public String decode(int num) {
        if (num < 100 || num > 999) {
            return "";
        }
        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .mapToObj(this::digitToBarcode)
                .collect(Collectors.joining());
    }
}
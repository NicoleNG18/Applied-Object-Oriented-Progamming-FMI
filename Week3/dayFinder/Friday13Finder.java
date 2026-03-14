package dayFinder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class Friday13Finder {

    static void main() {
        Random random = new Random();
        int year = random.nextInt(1900, 2020 + 1);

        for (int i = 1; i < 12; i++) {
            LocalDate localDate = LocalDate.of(year, i, 13);
            if (DayOfWeek.FRIDAY == localDate.getDayOfWeek()) {
                System.out.println(localDate);
            }
        }
    }
}

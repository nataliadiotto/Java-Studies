import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LocalDate[] dates = {
                LocalDate.of(2023, 07, 13),
                LocalDate.of(2023, 07, 14),
                LocalDate.of(2023, 07, 13),
                LocalDate.of(2023, 07, 14),
                LocalDate.of(2023, 07, 12),
                LocalDate.of(2023, 07, 12),
                LocalDate.of(2023, 07, 12),
                LocalDate.of(2023, 07, 15),
                LocalDate.of(2023, 07, 13),
                LocalDate.of(2023, 07, 12),
                LocalDate.of(2023, 07, 17),
                LocalDate.of(2023, 07, 16),
        };

        int[] quantities = {12, 30, 4, 98, 4, 8, 31, 74, 12, 1, 3, 35};

        Map<LocalDate, Integer> dateCountMap = new HashMap<>();

        for (int i = 0; i < dates.length; i++) {
            LocalDate date = dates[i];
            int quantity = quantities[i];
            dateCountMap.put(date, dateCountMap.getOrDefault(date, 0) + quantity);
        }

        Arrays.stream(dates)
                .forEach(date -> dateCountMap.put(date, dateCountMap.getOrDefault(date,0) + 1));

        dateCountMap.forEach((date, count) -> System.out.println(date + ": " + count));


    }
}

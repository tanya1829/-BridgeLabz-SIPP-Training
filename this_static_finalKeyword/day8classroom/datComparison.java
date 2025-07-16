package day8classroom;

import java.time.LocalDate;

public class datComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 6, 1);
        LocalDate date2 = LocalDate.of(2024, 6, 26);

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Both dates are the same");
        }
    }
}

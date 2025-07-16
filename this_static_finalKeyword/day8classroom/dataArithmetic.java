package day8classroom;

import java.time.LocalDate;

public class dataArithmetic {
    
 public static void main(String[] args) {
        LocalDate today = LocalDate.of(2024, 6, 26); // You can replace with user input

        LocalDate updated = today.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + today);
        System.out.println("Updated Date: " + updated);
    }
}

package com.studyopedia.BuiltInFunctions.level2;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        LocalDate added = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = added.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("After Adding 7 days, 1 month, 2 years: " + added);
        System.out.println("After Subtracting 3 weeks: " + finalDate);
    }
}


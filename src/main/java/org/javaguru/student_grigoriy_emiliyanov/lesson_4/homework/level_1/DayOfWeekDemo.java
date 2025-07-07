package org.javaguru.student_grigoriy_emiliyanov.lesson_4.homework.level_1;

import java.util.Scanner;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number [1-7]:");
        int inputNumber = scanner.nextInt();
        String day = "";
        if (inputNumber == 1) {
            day = "Monday";
        } else if (inputNumber == 2) {
            day = "Tuesday";
        } else if (inputNumber == 3) {
            day = "Wednesday";
        } else if (inputNumber == 4) {
            day = "Thursday";
        } else if (inputNumber == 5) {
            day = "Friday";
        } else if (inputNumber == 6) {
            day = "Saturday";
        } else if (inputNumber == 7) {
            day = "Sunday";
        } else {
            day = "unknown";
        }
        System.out.println("The day of week is: " + day);
    }
}

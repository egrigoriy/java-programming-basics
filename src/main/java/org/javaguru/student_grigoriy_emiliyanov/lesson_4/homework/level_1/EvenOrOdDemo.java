package org.javaguru.student_grigoriy_emiliyanov.lesson_4.homework.level_1;

import java.util.Scanner;

public class EvenOrOdDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }
}

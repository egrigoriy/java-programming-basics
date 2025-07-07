package org.javaguru.student_grigoriy_emiliyanov.lesson_4.homework.level_2;

import java.util.Scanner;

public class BiggestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter your number 2:");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("The biggest numbers is: " + number1);
        } else {
            System.out.println("The biggest numbers is: " + number2);
        }
    }
}

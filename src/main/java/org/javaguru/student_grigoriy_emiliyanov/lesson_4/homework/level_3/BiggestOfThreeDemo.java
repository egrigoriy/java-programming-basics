package org.javaguru.student_grigoriy_emiliyanov.lesson_4.homework.level_3;

import java.util.Scanner;

public class BiggestOfThreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter your number 2:");
        int number2 = scanner.nextInt();
        System.out.println("Enter your number 3:");
        int number3 = scanner.nextInt();
        int biggest = number1;
        if (number2 > biggest) {
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        System.out.println("The biggest number is: " + biggest);
    }
}

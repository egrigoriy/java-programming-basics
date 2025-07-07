package org.javaguru.student_grigoriy_emiliyanov.lesson_5.lessoncode.tasks;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number));
        System.out.println("Enter your number:");
        number = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number));
        System.out.println("Enter your number:");
        number = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number));
    }

}

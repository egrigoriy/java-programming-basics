package org.javaguru.student_grigoriy_emiliyanov.lesson_2.homework.level_2;


import java.util.Scanner;

//        Написать консольную программу, которая запрашивает
//                имя пользователя и выводит на консоль текст:
//
//                Hello имя пользователя!
public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}

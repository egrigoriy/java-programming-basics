package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot vanya = new Robot("Vania");
        Robot vasya = new Robot("Vasya");

        System.out.println("My name is: " + vanya.getName());
        System.out.println("My name is: " + vasya.getName());
    }
}

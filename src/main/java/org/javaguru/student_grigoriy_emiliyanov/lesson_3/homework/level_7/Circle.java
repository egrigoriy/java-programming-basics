package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_7;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

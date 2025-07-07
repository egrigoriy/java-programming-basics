package org.javaguru.student_grigoriy_emiliyanov.lesson_5.lessoncode.tasks;

public class MaxNumber {

    int findMax(int a, int b) {
        return a > b ? a : b;
    }

    int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }
}

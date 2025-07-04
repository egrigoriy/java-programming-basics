package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_4;

public class Patient {
    private String firstName;
    private String lastName;

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

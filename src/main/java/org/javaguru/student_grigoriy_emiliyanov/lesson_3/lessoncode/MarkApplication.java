package org.javaguru.student_grigoriy_emiliyanov.lesson_3.lessoncode;

public class MarkApplication {
    public static void main(String[] args) {
        Mark mark = new Mark("Ivan", "Ivanov", "Math", "A");

        System.out.println("Mark:");
        System.out.println("Strudent first name: " + mark.getStudentFirstName());
        System.out.println("Strudent last name: " + mark.getStudentLastName());
        System.out.println("Mark on subject: " + mark.getSubject());
        System.out.println("Grade: " + mark.getGrade());
    }
}

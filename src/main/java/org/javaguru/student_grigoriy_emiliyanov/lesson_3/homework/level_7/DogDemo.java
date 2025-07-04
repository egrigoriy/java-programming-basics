package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_7;

public class DogDemo {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 0);

        System.out.println(rex.bark());

        rex.birthday();
        rex.birthday();
        System.out.println(rex.getAge());
    }
}

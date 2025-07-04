package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_7;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String bark() {
        return "My name is " + nickname;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }
}

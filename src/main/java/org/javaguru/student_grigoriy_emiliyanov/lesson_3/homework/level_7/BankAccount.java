package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_7;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

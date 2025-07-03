package org.javaguru.student_grigoriy_emiliyanov.lesson_3.lessoncode;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Petia", 1);
        BankAccount bankAccount2 = new BankAccount("Nikolay", 2);

        BankAccount bankAccount3 = new BankAccount("Vasia");
        BankAccount bankAccount4 = new BankAccount("Nika");

        BankAccount bankAccount5 = new BankAccount(100);
    }
}

package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_4;

public class Visit {
    private Patient patient;
    private int price;

    private String diagnosis = null;

    public Visit(Patient patient, int price) {
        this.patient = patient;
        this.price = price;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "patient=" + patient +
                ", price=" + price +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}

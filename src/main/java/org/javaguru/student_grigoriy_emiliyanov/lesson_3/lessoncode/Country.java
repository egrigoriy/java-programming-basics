package org.javaguru.student_grigoriy_emiliyanov.lesson_3.lessoncode;

public class Country {

    private String name;
    private String code;
    private double population; // in millions

    public Country(String name, String code, double population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPopulation() {
        return population;
    }
}

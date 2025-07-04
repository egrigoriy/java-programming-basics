package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_2;

public class Car {
    private String maker;
    private String color;
    private int price;

    public Car(String maker, String color, int price) {
        this.maker = maker;
        this.color = color;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Maker: " + this.maker + "\n" +
                "Color: " + this.color + "\n" +
                "Price: " + "USD " + this.price;
    }
}

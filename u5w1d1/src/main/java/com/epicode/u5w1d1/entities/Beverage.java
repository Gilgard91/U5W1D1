package com.epicode.u5w1d1.entities;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Beverage {
    private String name;
    private double price;
    private String nutritionalInfo;

    public Beverage() {
    }

    public Beverage(String name, double price, String nutritionalInfo) {
        this.name = name;
        this.price = price;
        this.nutritionalInfo = nutritionalInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }

    public void setNutritionalInfo(String nutritionalInfo) {
        this.nutritionalInfo = nutritionalInfo;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nutritionalInfo='" + nutritionalInfo + '\'' +
                '}';
    }
}

package com.epicode.u5w1d1.entities;

import java.util.List;


//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings;

    public Pizza() {
    }

    public Pizza(String name, double price, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
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

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}

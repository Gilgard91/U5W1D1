package com.epicode.u5w1d1.entities;

import java.util.List;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Menu {
    private List<Pizza> pizzas;
    private List<Beverage> beverages;

    public Menu() {
    }

    public Menu(List<Pizza> pizzas, List<Beverage> beverages) {
        this.pizzas = pizzas;
        this.beverages = beverages;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", beverages=" + beverages +
                '}';
    }
}

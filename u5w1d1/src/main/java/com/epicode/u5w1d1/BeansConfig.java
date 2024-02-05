package com.epicode.u5w1d1;

import com.epicode.u5w1d1.entities.Beverage;
import com.epicode.u5w1d1.entities.Menu;
import com.epicode.u5w1d1.entities.Pizza;
import com.epicode.u5w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setPrice(4.99);
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato"));
        toppings.add(new Topping("Cheese"));
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaiian Pizza");
        pizza.setPrice(6.49);
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato"));
        toppings.add(new Topping("Cheese"));
        toppings.add(new Topping("Ham"));
        toppings.add(new Topping("Pineapple"));
        pizza.setToppings(toppings);
        return pizza;
    }

    @Bean
    public Pizza salamiPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Salami Pizza");
        pizza.setPrice(5.99);
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato"));
        toppings.add(new Topping("Cheese"));
        toppings.add(new Topping("Salami"));
        pizza.setToppings(toppings);
        return pizza;
    }

    @Bean
    public Beverage lemonade() {
        Beverage beverage = new Beverage();
        beverage.setName("Lemonade");
        beverage.setPrice(1.29);
        beverage.setNutritionalInfo("Calories: 128");
        return beverage;
    }

    @Bean
    public Beverage water() {
        Beverage beverage = new Beverage();
        beverage.setName("Water");
        beverage.setPrice(1.29);
        beverage.setNutritionalInfo("Calories: 0");
        return beverage;
    }

    @Bean
    public Beverage wine() {
        Beverage beverage = new Beverage();
        beverage.setName("Wine");
        beverage.setPrice(7.49);
        beverage.setNutritionalInfo("Calories: 607");
        return beverage;
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.setPizzas(Arrays.asList(margherita(), hawaiianPizza(), salamiPizza()));
        menu.setBeverages(Arrays.asList(lemonade(), water(), wine()));
        return menu;
    }
}

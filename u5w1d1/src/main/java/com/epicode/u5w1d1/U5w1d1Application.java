package com.epicode.u5w1d1;

import com.epicode.u5w1d1.entities.Beverage;
import com.epicode.u5w1d1.entities.Menu;
import com.epicode.u5w1d1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w1d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);

		Menu menu = ctx.getBean(Menu.class);


		System.out.println("Menu:");
		for (Pizza pizza : menu.getPizzas()) {
			System.out.println("Pizza: " + pizza.getName() + ", Price: €" + pizza.getPrice());
			System.out.println("Toppings: " + pizza.getToppings());
		}

		for (Beverage beverage : menu.getBeverages()) {
			System.out.println("Beverage: " + beverage.getName() + ", Price: €" + beverage.getPrice());
			System.out.println("Nutritional Info: " + beverage.getNutritionalInfo());
		}
	}

}

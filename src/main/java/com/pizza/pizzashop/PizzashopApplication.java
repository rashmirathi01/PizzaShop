package com.pizza.pizzashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pizza.pizzashop.*") 
public class PizzashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzashopApplication.class, args);
	}
}

package com.pizza.pizzashop.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PizzaBean {
	
	private String name;
	private String type;
	private List<String> ingredients;
	private Double price;

	public PizzaBean() {
	}

	public PizzaBean(String name, String type, List ingredients, Double price) {
		this.name = name;
		this.type = type;
		this.ingredients = ingredients;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {

		this.ingredients = ingredients;
	}

	public void addIngredient(String ingr) {
		if (this.ingredients == null) {
			this.ingredients = new ArrayList<String>();
		}
		this.ingredients.add(ingr);
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}

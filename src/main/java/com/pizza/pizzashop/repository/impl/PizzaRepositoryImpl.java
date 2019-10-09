package com.pizza.pizzashop.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pizza.pizzashop.bean.PizzaBean;
import com.pizza.pizzashop.repository.PizzaRepository;

@Repository
// @Service
public class PizzaRepositoryImpl implements PizzaRepository {

	@Autowired
	PizzaRepository pizzaRepository;
	
	private static List pizzaList;

	static {
		if (pizzaList == null) {
			pizzaList = new ArrayList<PizzaBean>();
			List ingredients = Arrays.asList("onion, tomato");
			pizzaList.add(new PizzaBean("Pizza1", "veg", ingredients, 120.0));

			ingredients.add("paneer");
			pizzaList.add(new PizzaBean("Pizza2", "veg", ingredients, 150.0));

			ingredients.add("egg");
			pizzaList.add(new PizzaBean("Pizza3", "nonveg", ingredients, 160.0));

			ingredients.remove("egg");
			ingredients.add("chicken");
			pizzaList.add(new PizzaBean("Pizza4", "nonveg", ingredients, 190.0));
		}
	}

	@Override
	public List<PizzaBean> getAll() {
		return pizzaList;
	}

}

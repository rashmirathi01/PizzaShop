package com.pizza.pizzashop.repository;

import java.util.List;

import com.pizza.pizzashop.bean.PizzaBean;

public interface PizzaRepository {

	public List<PizzaBean> getAll();
}

package com.pizza.pizzashop.repository;

import java.util.List;

import com.pizza.pizzashop.bean.OrderBean;

public interface OrderRepository {
	
	public List postOrder(OrderBean order);

}

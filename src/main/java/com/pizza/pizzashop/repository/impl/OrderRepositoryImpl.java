package com.pizza.pizzashop.repository.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pizza.pizzashop.bean.OrderBean;
import com.pizza.pizzashop.bean.User;
import com.pizza.pizzashop.repository.OrderRepository;
import com.pizza.pizzashop.repository.PizzaRepository;

@Repository
// @Service
public class OrderRepositoryImpl implements OrderRepository {

	@Autowired
	PizzaRepository pizzaRepository;

	private static Map<User, List<OrderBean>> orders;
	private static Integer nextOrderId;

	static {
		if (orders == null) {
			orders = new HashMap<User, List<OrderBean>>();
			nextOrderId = 0;
		}

	}

	@Override
	public List postOrder(OrderBean order) {
		int orderId = nextOrderId + 1;
		order.setOrderDate(new Timestamp(System.currentTimeMillis()));
		List<OrderBean> orderList = orders.get(order.getUser());
		if (orderList == null) {
			orderList = new ArrayList<OrderBean>();
		}
		orderList.add(order);
		orders.put(order.getUser(), orderList);
		nextOrderId = orderId;
		return orderList;
	}

}

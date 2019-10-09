package com.pizza.pizzashop.bean;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class OrderBean {

	private String pizzaName;
	private User user;
	private Timestamp orderDate;

	public OrderBean() {

	}

	public OrderBean(String pizzaName, User user, Timestamp orderDate) {
		super();
		this.pizzaName = pizzaName;
		this.user = user;
		this.orderDate = orderDate;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

}

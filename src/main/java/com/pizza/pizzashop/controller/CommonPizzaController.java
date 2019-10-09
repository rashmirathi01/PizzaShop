package com.pizza.pizzashop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.pizzashop.bean.OrderBean;
import com.pizza.pizzashop.repository.OrderRepository;
import com.pizza.pizzashop.repository.PizzaRepository;

@RestController
public class CommonPizzaController {

	@Autowired
	private PizzaRepository pizzaRepository;

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping(path = "/pizzas", consumes = "application/json", produces = "application/json")
	public ResponseEntity getPizzaList() {
		try {
			return new ResponseEntity(HttpStatus.OK).ok(pizzaRepository.getAll());
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.GATEWAY_TIMEOUT);
		}

	}

	@PostMapping(path = "/order", consumes = "application/json", produces = "application/json")
	public ResponseEntity saveOrder(@RequestBody OrderBean order) {
		try {
			return new ResponseEntity(HttpStatus.OK).ok(orderRepository.postOrder(order));
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.GATEWAY_TIMEOUT);
		}
	}
}

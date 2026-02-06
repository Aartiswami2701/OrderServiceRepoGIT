package com.example.orders.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orders.entity.Order;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@PostMapping("/create")
	public String createOrders(@RequestBody Order order) {
		return "order created";
	}
}

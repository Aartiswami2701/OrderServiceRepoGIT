package com.example.orders.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@PostMapping("/create")
	public String createOrders() {
		return "order created";
	}
}

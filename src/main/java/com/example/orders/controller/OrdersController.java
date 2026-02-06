package com.example.orders.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@PostMapping("/createorder")
	public String createOrders() {
		return "order created";
	}
	
	@GetMapping("/findorderbyid/{id}")
	public ResponseEntity<String> getOrder(@PathVariable String id) {
		if(id==null ||id.trim().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok("order id : "+id);
	}
}

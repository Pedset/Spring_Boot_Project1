package com.example;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/add")
	public Adding add(@RequestParam(value = "num", defaultValue = "0") ArrayList<String> num) {
		return new Adding(counter.incrementAndGet(), num);
	}
	
	@GetMapping("/multi")
	public Multi multi(@RequestParam(value = "num", defaultValue = "0") ArrayList<String> num) {
		return new Multi(counter.incrementAndGet(), num);
	}
	
	@GetMapping("/div")
	public Div div(@RequestParam(value = "num", defaultValue = "0") ArrayList<String> num) {
		return new Div(counter.incrementAndGet(), num);
	}
	
}

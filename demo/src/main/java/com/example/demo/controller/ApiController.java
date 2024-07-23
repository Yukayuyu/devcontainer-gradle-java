package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ApiService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class ApiController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	private final ApiService apiService;

	@Autowired
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}

	@GetMapping("")
	public String helloWorld() {
		return new String("hello, world!");
	}

	@GetMapping("/")
	public String hello() {
		return "hello!";
	}

	@GetMapping("/greeting")
	public String greeting(String name) {
		return "new Greeting(counter.incrementAndGet(), String.format(template, name))";
	}

	@GetMapping("/greeting2")
	public String greeting2(@RequestParam String name) {
		return String.format(template, name);
	}

	@GetMapping("/api")
	public String getExternalApi(@RequestParam String name) {
		return apiService.getExternalApiData() + name;
	}

}

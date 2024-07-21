package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String hello() {
		String helloString = "";
		return "hello world" + helloString;
	}

	@GetMapping("/greeting")
	public String greeting(String name) {
		return "new Greeting(counter.incrementAndGet(), String.format(template, name))";
	}

	@GetMapping("/greeting2")
	public String greeting2(String name) {
		return "new Greeting(counter.incrementAndGet(), String.format(template, name))";
	}
}

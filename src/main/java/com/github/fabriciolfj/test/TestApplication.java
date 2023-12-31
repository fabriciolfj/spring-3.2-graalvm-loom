package com.github.fabriciolfj.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

@RestController
class CustomersHttpController {

	@GetMapping("/customers")
	Collection<Customer> customers() {
		return Set.of(new Customer(1, "A"), new Customer(2, "B"), new Customer(3, "C"));
	}

	record Customer(Integer id, String name) {
	}

}

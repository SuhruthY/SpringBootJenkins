package com.suhruth.springbootjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String welcome() {
		return "<h1>Welcome to Spring Boot Jenkins</h1>";
	}
	
}

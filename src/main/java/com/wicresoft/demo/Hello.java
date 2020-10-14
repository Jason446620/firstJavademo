package com.wicresoft.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/hi")
	public String hi() {
		return "hi, I'm springboot !";
	}

}

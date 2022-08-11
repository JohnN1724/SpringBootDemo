package com.softwareinstitute.training.spring.vets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetsApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/makeCat")
	public String myResponse(){
		Cat cat = new Cat();
		return cat.toString();
	}

}

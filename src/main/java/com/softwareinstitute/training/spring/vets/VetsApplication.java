package com.softwareinstitute.training.spring.vets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class VetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetsApplication.class, args);
	}

	public static CatList myCatList = new CatList();


	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	@ResponseBody
	public String myResponse(){
		return myCatList.toString();
	}

	@PutMapping("/change/{id}")
	@ResponseBody
	public void change(@PathVariable int id, @RequestParam String Mammal, @RequestParam String animalType,
					   @RequestParam String catType, @RequestParam String name) {
		myCatList.changeCatList(id,new Cat());

	}

	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String Mammal, @RequestParam String animalType,
					   @RequestParam String catType, @RequestParam String name) {
		myCatList.addCatList(new Cat(Mammal, animalType, catType, name));

	}

}

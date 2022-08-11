package com.softwareinstitute.training.spring.vets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VetsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void get_default_cat_name() {

		Cat cat = new Cat();

		assertEquals("Ginger", cat.getName(), cat.getName());
	}

	@Test
	public void get_bat_flying(){

		Bat bat = new Bat();

		assertEquals("I'm flying!!", bat.flying());
	}

	@Test
	public void get_bird_layingEgg() {

		Penguin penguin = new Penguin();

		assertEquals("I'm laying an egg!!", penguin.getLayEgg());
	}

	@Test
	public void get_penguin_swimming() {

		Penguin penguin = new Penguin();

		assertEquals("I'm swimming!!", penguin.swim());
	}

	@Test
	public void get_default_penguin_name() {

		Penguin penguin = new Penguin();

		assertEquals("Pete", penguin.getName(), penguin.getName());
	}

	@Test
	public void get_default_bat_name() {

		Bat bat = new Bat();

		assertEquals("Boris", bat.getName(), bat.getName());
	}

	@Test
	public void get_live_birth(){

		Cat cat = new Cat();

		assertEquals("Performing a live birth!", cat.getLiveBrith(), cat.getLiveBrith());
	}

	@Test
	public void get_poop(){

		FlyingRat rat = new FlyingRat();

		assertEquals("Poop time!!", rat.isPooping, rat.isPooping);
	}

}

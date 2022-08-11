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

		assertEquals("Poop time!!", rat.ISPOOPING, rat.ISPOOPING);
	}

	@Test
	public void get_living_status(){

		FlyingRat rat = new FlyingRat();

		assertEquals("I am alive!!", rat.ISALIVE, rat.ISALIVE);
	}

	@Test
	public void get_sleeping(){

		Penguin penguin = new Penguin();

		assertEquals("zzz...zzz...", penguin.ISSLEEPING, penguin.ISSLEEPING);
	}

	@Test
	public void get_breathing(){

		Penguin penguin = new Penguin();

		assertEquals("Deep Breath!", penguin.ISBREATHING, penguin.ISBREATHING);
	}

	@Test
	public void get_eating(){

		Cat cat = new Cat();

		assertEquals("This food is great!", cat.ISEATING, cat.ISEATING);
	}

	@Test
	public void test_swimming(){

		Penguin penguin = new Penguin();

		assertEquals("Diving!! *Splash*", penguin.dive(), penguin.dive());
		assertEquals("I'm swimming!!", penguin.swim(), penguin.swim());
		assertEquals("I'm getting out of the water'!!", penguin.getOutWater(), penguin.getOutWater());

	}

	@Test
	public void test_flying(){

		FlyingRat rat = new FlyingRat();

		assertEquals("Taking off!!", rat.takeOff(), rat.takeOff());
		assertEquals("I'm flying!!", rat.flying(), rat.flying());
		assertEquals("I am landing!!", rat.landing(), rat.landing());

	}

}

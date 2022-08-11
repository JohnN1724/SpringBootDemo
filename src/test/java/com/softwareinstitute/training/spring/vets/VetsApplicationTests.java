package com.softwareinstitute.training.spring.vets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VetsApplicationTests {

	@Test
	void get_default_cat_name() {

		Cat cat = new Cat();

		assertEquals("Ginger", cat.getName(), cat.getName());
	}

	@Test
	void get_bat_flying(){

		Bat bat = new Bat();

		assertEquals("I'm flying!!", bat.flying());
	}

	@Test
	void get_bird_layingEgg() {

		Penguin penguin = new Penguin();

		assertEquals("I'm laying an egg!!", penguin.getLayEgg());
	}

	@Test
	void get_penguin_swimming() {

		Penguin penguin = new Penguin();

		assertEquals("I'm swimming!!", penguin.swim());
	}

	@Test
	void get_default_penguin_name() {

		Penguin penguin = new Penguin();

		assertEquals("Pete", penguin.getName(), penguin.getName());
	}

	@Test
	void get_default_bat_name() {

		Bat bat = new Bat();

		assertEquals("Boris", bat.getName(), bat.getName());
	}

	@Test
	void get_live_birth(){

		Cat cat = new Cat();

		assertEquals("Performing a live birth!", cat.getLiveBrith(), cat.getLiveBrith());
	}

	@Test
	void get_poop(){

		FlyingRat rat = new FlyingRat();

		assertEquals("Poop time!!", rat.ISPOOPING, rat.ISPOOPING);
	}

	@Test
	void get_living_status(){

		FlyingRat rat = new FlyingRat();

		assertEquals("I am alive!!", rat.ISALIVE, rat.ISALIVE);
	}

	@Test
	void get_sleeping(){

		Penguin penguin = new Penguin();

		assertEquals("zzz...zzz...", penguin.ISSLEEPING, penguin.ISSLEEPING);
	}

	@Test
	void get_breathing(){

		Penguin penguin = new Penguin();

		assertEquals("Deep Breath!", penguin.ISBREATHING, penguin.ISBREATHING);
	}

	@Test
	void get_eating(){

		Cat cat = new Cat();

		assertEquals("This food is great!", cat.ISEATING, cat.ISEATING);
	}

	@Test
	void test_swimming(){

		Penguin penguin = new Penguin();

		assertEquals("Diving!! *Splash*", penguin.dive(), penguin.dive());
		assertEquals("I'm swimming!!", penguin.swim(), penguin.swim());
		assertEquals("I'm getting out of the water'!!", penguin.getOutWater(), penguin.getOutWater());

	}

	@Test
	void test_flying(){

		FlyingRat rat = new FlyingRat();

		assertEquals("Taking off!!", rat.takeOff(), rat.takeOff());
		assertEquals("I'm flying!!", rat.flying(), rat.flying());
		assertEquals("I am landing!!", rat.landing(), rat.landing());

	}

	@Test
	void test_cat_getters_and_setters(){

		Cat cat = new Cat("Mammal", "Cat", "Persian", "Boop");

		assertEquals("Boop", cat.getName(), cat.getName());

		// Testing set method for name
		cat.setName("Beep");
		assertEquals("Beep", cat.getName(), cat.getName());

		// Testing set method for catType
		cat.setCatType("Tabby");
		assertEquals("Tabby", cat.getCatType(), cat.getCatType());

	}

	@Test
	void test_bat_getters_and_setters(){

		Bat bat = new Bat("Mammal", "Bat", "Boris", "Vampire");

		assertEquals("Boris", bat.getName(), bat.getName());

		// Testing set method for name
		bat.setName("Benjamin");
		assertEquals("Benjamin", bat.getName(), bat.getName());

		// Testing set method for batType
		bat.setBatType("Fruit");
		assertEquals("Fruit", bat.getBatType(), bat.getBatType());

	}

	@Test
	void test_penguin_getters_and_setters(){

		Penguin penguin = new Penguin("Mammal", "Penguin", "Peter", "Emperor");

		assertEquals("Peter", penguin.getName(), penguin.getName());

		// Testing set method for name
		penguin.setName("William");
		assertEquals("William", penguin.getName(), penguin.getName());

		// Testing set method for penguinType
		penguin.setPenguinType("King");
		assertEquals("King", penguin.getPenguinType(), penguin.getPenguinType());

	}

	@Test
	void test_flyingRat_getters_and_setters(){

		FlyingRat flyingRat = new FlyingRat("Mammal", "Flying Rat", "Pigeon", "Pete");

		assertEquals("Pete", flyingRat.getName(), flyingRat.getName());

		// Testing set method for name
		flyingRat.setName("Sam");
		assertEquals("Sam", flyingRat.getName(), flyingRat.getName());

		// Testing set method for penguinType
		flyingRat.setFlyingRatType("Seagull");
		assertEquals("Seagull", flyingRat.getFlyingRatType(), flyingRat.getFlyingRatType());

	}

}

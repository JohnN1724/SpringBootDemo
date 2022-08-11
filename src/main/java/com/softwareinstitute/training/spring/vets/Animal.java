package com.softwareinstitute.training.spring.vets;

public class Animal {

    private String animalType;
    private String breed;

    static final String isBreathing = "Deep Breath!";
    static final String isEating = "This food is great!";
    static final String isSleeping = "zzz...zzz...";
    static final String isAlive = "I am alive!!";
    static final String isPooping = "Poop time!!";

    public Animal(String animalType) {

        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public <T extends Animal> Animal breed(Animal partner) {

        Animal babyAnimal = null;
        try {
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
        }catch (Exception e) {
        }
        return babyAnimal;
    }
}

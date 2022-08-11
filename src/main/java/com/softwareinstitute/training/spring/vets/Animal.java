package com.softwareinstitute.training.spring.vets;

public class Animal {

    private String animalType;

    static final String ISBREATHING = "Deep Breath!";
    static final String ISEATING = "This food is great!";
    static final String ISSLEEPING = "zzz...zzz...";
    static final String ISALIVE = "I am alive!!";
    static final String ISPOOPING = "Poop time!!";

    public Animal(String animalType) {

        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

}

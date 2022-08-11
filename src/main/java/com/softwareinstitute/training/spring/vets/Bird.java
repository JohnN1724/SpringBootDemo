package com.softwareinstitute.training.spring.vets;

public class Bird extends Animal{

    private String birdName;
    private String layEgg;

    public Bird(String animalType, String birdName){
        super(animalType);

        this.birdName = birdName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getLayEgg() {
        return "I'm laying an egg!!";
    }

    public void setLayEgg(String layEgg) {
        this.layEgg = layEgg;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                ", layEgg='" + layEgg + '\'' +
                '}';
    }
}

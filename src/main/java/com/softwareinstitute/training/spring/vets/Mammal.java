package com.softwareinstitute.training.spring.vets;

public class Mammal extends Animal{

    private String mammalName;
    private String liveBrith;

    public Mammal(String animalType, String mammalName) {
        super(animalType);

        this.mammalName = mammalName;
    }

    public String getMammalName() {
        return mammalName;
    }

    public void setMammalName(String mammalName) {
        this.mammalName = mammalName;
    }

    public String getLiveBrith() {
        return "Performing a live birth!";
    }

    public void setLiveBrith(String liveBrith) {
        this.liveBrith = liveBrith;
    }
}

package com.softwareinstitute.training.spring.vets;

public class FlyingRat extends Bird implements Flying{

    private String name;
    private String flyingRatType;

    public FlyingRat(String animalType, String birdName, String name, String flyingRatType){
        super(animalType, birdName);

        this.name = name;
        this.flyingRatType = flyingRatType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlyingRatType() {
        return flyingRatType;
    }

    public void setFlyingRatType(String flyingRatType) {
        this.flyingRatType = flyingRatType;
    }
}

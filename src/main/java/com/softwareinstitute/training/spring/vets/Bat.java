package com.softwareinstitute.training.spring.vets;

public class Bat extends Mammal implements Flying{

    private String name;
    private String batType;

    public Bat(String animalType, String mammalName, String name, String batType){
        super(animalType, mammalName);

        this.name = name;
    }

    public Bat(){
        super("Mammal", "Bat");

        this.name = "Boris";
        this.batType = "Vampire";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatType() {
        return batType;
    }

    public void setBatType(String batType) {
        this.batType = batType;
    }

    @Override
    public String toString() {
        return "Bat{" +
                "name='" + name + '\'' +
                ", batType='" + batType + '\'' +
                '}';
    }
}

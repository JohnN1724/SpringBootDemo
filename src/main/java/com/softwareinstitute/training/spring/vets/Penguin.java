package com.softwareinstitute.training.spring.vets;

public class Penguin extends Bird implements Swimming{

    private String name;
    private String penguinType;

    public Penguin(String animalType, String birdName, String name, String penguinType){
        super(animalType, birdName);

        this.name = name;
        this.penguinType = penguinType;
    }

    public Penguin(){
        super("Bird", "Penguin");

        this.name = "Pete";
        this.penguinType = "Emperor";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPenguinType() {
        return penguinType;
    }

    public void setPenguinType(String penguinType) {
        this.penguinType = penguinType;
    }
}


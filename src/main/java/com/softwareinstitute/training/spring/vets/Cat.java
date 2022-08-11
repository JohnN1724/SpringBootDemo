package com.softwareinstitute.training.spring.vets;

public class Cat extends Mammal{

    final static String kill = "This mouse is mine!!";
    private String name;
    private String catType;

    public Cat(String animalType, String mammalName, String catType, String name) {
        super(animalType, mammalName);

        this.name = name;
        this.catType = catType;
    }

    public Cat(){
        super("Mammal", "Cat");

        this.name = "Ginger";
        this.catType = "Tabby";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", catType='" + catType + '\'' +
                '}';
    }
}

package com.softwareinstitute.training.spring.vets;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CatList {

    private List<Cat> animalList = new ArrayList();


    public void animalList(){
        this.animalList.add(new Cat("Mammal", "Cat", "Tabby", "Fluffy"));
    }

    public List<Cat> getAnimalList(){
        return this.animalList;
    }

    public String toString(){
        String json = new Gson().toJson(animalList);
        return  json;
    }

    public void addCatList(Cat c){
        this.animalList.add(c);
    }

    public void changeCatList(int id,Cat c){
        this.animalList.set(id,c);
    }
}

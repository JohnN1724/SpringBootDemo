package com.softwareinstitute.training.spring.vets;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class VetsList {

    private List<VetsList> animalList = new ArrayList();


    public void animalList(){
        this.animalList.add(new VetsList());
    }

    public List<VetsList> getAnimalList(){
        return this.animalList;
    }

    public String toString(){
        String json = new Gson().toJson(animalList);
        return  json;
    }

    public void addVetsList(VetsList v){
        this.animalList.add(v);
    }

    public void changeVetsList(int id,VetsList v){
        this.animalList.set(id,v);
    }
}

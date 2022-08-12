package com.softwareinstitute.training.spring.vets;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BatList {

    private List<Cat> myBatList = new ArrayList();


    public void myBatList(){
        this.myBatList.add(new Cat("Mammal", "Cat", "Tabby", "Fluffy"));
    }

    public List<Cat> getMyBatList(){
        return this.myBatList;
    }

    public String toString(){
        String json = new Gson().toJson(myBatList);
        return  json;
    }

    public void addBatList(Cat c){
        this.myBatList.add(c);
    }

    public void changeBatList(int id,Cat c){
        this.myBatList.set(id,c);
    }
}


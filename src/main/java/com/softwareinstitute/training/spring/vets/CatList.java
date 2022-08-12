package com.softwareinstitute.training.spring.vets;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatList {

    private List<Cat> myCatList = new ArrayList();


    public void myCatList(){
        this.myCatList.add(new Cat("Mammal", "Cat", "Tabby", "Fluffy"));
    }

    public List<Cat> getMyCatList(){
        return this.myCatList;
    }

    public String toString(){
        String json = new Gson().toJson(myCatList);
        return  json;
    }

    public void addCatList(Cat c){
        this.myCatList.add(c);
    }

    public void changeCatList(int id,Cat c){
        this.myCatList.set(id,c);
    }
}

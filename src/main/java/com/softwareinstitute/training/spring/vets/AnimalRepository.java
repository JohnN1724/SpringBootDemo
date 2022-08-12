package com.softwareinstitute.training.spring.vets;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

    private List<Cat> animalList = new ArrayList<>();
    private List<Cat> searchanimalList = new ArrayList<>();

    public List<Cat> getAll() {
        return animalList;
    }

    public void add() {
        this.animalList.add(new Cat("Mammal", "Cat", "Persian", "Black"));
        this.animalList.add(new Cat("Mammal", "Cat", "Tabby", "Black and White"));
        this.animalList.add(new Cat("Mammal", "Cat", "Tibbles", "Multicoloured"));
        this.animalList.add(new Cat("Mammal", "Cat", "Tom", "Ginger"));
    }

    public void addAnimal(Cat cat) {
        this.animalList.add(cat);
    }

    public List<Cat> searchAnimalByName(String name){
        searchanimalList.clear();
        for(int i = 0; i<animalList.size(); i++){
            if(animalList.get(i).getName().equals(name)){
                searchanimalList.add(animalList.get(i));
            }
        }
        return searchanimalList;
    }

    public String toStringJSON(List li){
        return new Gson().toJson(li);
    }

    /*public HashMap JSONtoArray(String str) throws JsonProcessingException {
        return new ObjectMapper().readValue(str, HashMap.class);
    }*/
}

package com.petshopmanagement.system;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PetRepository {

    private Set petList = new HashSet();

    public Set getPetList(){
        return petList;
    }

    void add(Pet pet) {
        petList.add(pet);
    }

    void remove(Pet pet) {
        petList.remove(pet);
    }

    Pet getPet(String id){

        for(Object pet: petList){
            Pet petObj = (Pet)pet;
            if (id.equals(petObj.id)){
                return petObj;
            }
        }
        return null;
    }
}

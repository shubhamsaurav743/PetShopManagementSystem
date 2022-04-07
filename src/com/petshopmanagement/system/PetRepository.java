package com.petshopmanagement.system;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {

    public List getPetList() {
        return petList;
    }

    private List petList = new ArrayList();


    void add(Pet pet) {

        petList.add(pet);
    }

}

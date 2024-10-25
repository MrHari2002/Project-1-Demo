package com.revature.services;

//Check UserService for general notes on Services

import com.revature.daos.PetDAO;
import com.revature.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Makes a class a bean. Stereotype annotation.
public class PetService {

    //autowire the PetDAO with constructor injection so we can use the PetDAO methods
    private PetDAO pDAO;

    @Autowired
    public PetService(PetDAO pDAO) {
        this.pDAO = pDAO;
    }

    //This method takes in a new Pet object and inserts it into the DB
    public Pet addPet(){
        return null;
    }


}

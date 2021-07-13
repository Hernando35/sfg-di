package com.hernandoguru.pets;

import org.springframework.stereotype.Service;

@Service
public class PetsFactory {

    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                System.out.println("Dog");
                return new DogPetService();
            case "cat":
                System.out.println("Cat");
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}

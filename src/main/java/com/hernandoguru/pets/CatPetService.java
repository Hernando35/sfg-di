package com.hernandoguru.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"cat", "default"})
public class CatPetService implements PetService {
        public String getPetType(){
            return "Cats are the best!";
        }
    }


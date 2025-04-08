package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.Pet;

@Service

public interface IPetService {
	
	public List<Pet> getAllPets();                  //read all
	public Optional<Pet> getPetById(int id);        //read by id
	public Pet createPet(Pet pet);                  //create
	public Pet updatePet(int id,Pet petDetails);    //update by id
	public void deletePet(int id);                 //delete by id


}

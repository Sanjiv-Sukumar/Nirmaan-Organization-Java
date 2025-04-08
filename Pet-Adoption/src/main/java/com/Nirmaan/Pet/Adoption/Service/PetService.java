package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.Pet;
import com.Nirmaan.Pet.Adoption.Repository.IPetRepository;

@Service

public class PetService implements IPetService{
	
	@Autowired IPetRepository repository;
//read
	@Override
	public List<Pet> getAllPets() {
		return repository.findAll();
	}

	@Override
	public Optional<Pet> getPetById(int id) {
		return repository.findById(id);
	}
//create
	@Override
	public Pet createPet(Pet pet) {
		return repository.save(pet);
	}
//update
	@Override
	public Pet updatePet(int id, Pet petDetails) {
		petDetails.setId(id);
		return repository.save(petDetails);
	}
//delete
	@Override
	public void deletePet(int id) {
		repository.deleteById(id);;
		
	}

}

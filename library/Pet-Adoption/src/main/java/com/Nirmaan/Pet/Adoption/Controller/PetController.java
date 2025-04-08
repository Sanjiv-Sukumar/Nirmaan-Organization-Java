package com.Nirmaan.Pet.Adoption.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nirmaan.Pet.Adoption.Entity.Pet;
import com.Nirmaan.Pet.Adoption.Service.IPetService;

@RestController
@RequestMapping("Pet")
public class PetController {
	
	@Autowired IPetService service;
	
//create Pet
		@PostMapping("create")
		public Pet createPet(@RequestBody Pet pet) {
			return  service.createPet(pet);
		}
		
//read Pet
		@GetMapping("readAll")
		public List<Pet> readAllPet() {
			return  service.getAllPets();
		}
		
		@GetMapping("read/{id}")
		public Pet readPetById(@PathVariable int id) {
			return  service.getPetById(id).get();
		}
		
//update Pet
		@PutMapping("update/{id}")
		public String updatePetById(@PathVariable int id,@RequestBody Pet pet ) {
			service.updatePet(id, pet);
			return "updated Pet Details Successfully";
		}
//delete Pet
		@DeleteMapping("delete/{id}")
		public String deletePetById(@PathVariable int id) {
			 service.deletePet(id);
			 return " delete the  Pet Id "+id+" successfully ";
		}
		
		
}

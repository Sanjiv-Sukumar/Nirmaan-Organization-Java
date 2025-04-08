package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.AdoptionRequest;
import com.Nirmaan.Pet.Adoption.Entity.Pet;
import com.Nirmaan.Pet.Adoption.Entity.User;
import com.Nirmaan.Pet.Adoption.Repository.IUserRepository;

@Service

public class UserService  implements IUserService{
	@Autowired IUserRepository repository;
//read
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		return repository.findById(id);
	}
//create
	@Override
	public User createUser(User user) {
		
		for(Pet pet   : user.getPets()) {
			pet.setUser(user);
		}
		
		for( AdoptionRequest ap :  user.getAdoptionRequests()) {
			for(Pet pet : user.getPets()) {
				ap.setPet(pet);
			}
		}
		
		return repository.save(user);
	}
//update
	@Override
	public User updateUser(int id, User userDetails) {
		userDetails.setId(id);
		return repository.save(userDetails);
	}
//delete
	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}
	
	

}

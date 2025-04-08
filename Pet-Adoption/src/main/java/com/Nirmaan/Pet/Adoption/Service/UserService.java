package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.User;

@Service

public interface IUserService {
	
	public List<User> getAllUsers();                  //read all
	public Optional<User> getUserById(int id);        //read by id
	public User createUser(User user);                //create
	public User updateUser(int id,User userDetails);  //update by id
	public void deleteById(int id);                   //delete by id

}

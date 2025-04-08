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

import com.Nirmaan.Pet.Adoption.Entity.User;
import com.Nirmaan.Pet.Adoption.Service.IUserService;

@RestController
@RequestMapping("User")
public class UserController {
	
	@Autowired IUserService service;

//create User
			@PostMapping("create")
			public User createUser(@RequestBody User user) {
				return  service.createUser(user);
			}
			
//read User
			@GetMapping("readAll")
			public List<User> readAllUser() {
				return  service.getAllUsers();
			}
			
			@GetMapping("read/{id}")
			public User readUserById(@PathVariable int id) {
				return  service.getUserById(id).get();
			}
			
//update User
			@PutMapping("update/{id}")
			public String updateUserById(@PathVariable int id,@RequestBody User user ) {
				service.updateUser(id, user);
				return "updated User Details Successfully";
			}
//delete User
			@DeleteMapping("delete/{id}")
			public String deleteUserById(@PathVariable int id) {
				 service.deleteById(id);
				 return " delete the  User Id "+id+" successfully ";
			}
			
}

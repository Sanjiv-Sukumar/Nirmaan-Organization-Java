package com.nirmaan.LibraryManagementSystem.controllers;



import com.nirmaan.LibraryManagementSystem.entities.User;
import com.nirmaan.LibraryManagementSystem.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("addUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
    @PutMapping("updateUser/{id}")
    public User updateUser(@RequestBody User user ,@PathVariable Long id) {
    	return userService.updateUser(user, id);
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}


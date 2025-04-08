package com.nirmaan.LibraryManagementSystem.services;


import com.nirmaan.LibraryManagementSystem.entities.User;
import com.nirmaan.LibraryManagementSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInter {
    @Autowired
    private UserRepository userRepository;
    

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
    	userRepository.deleteById(id);
    }
    
    public User updateUser(User user ,Long id) {
    	user.setId(id);
    	return userRepository.save(user);
    }
}


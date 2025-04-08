package com.nirmaan.LibraryManagementSystem.services;

import java.util.List;

import com.nirmaan.LibraryManagementSystem.entities.User;

public interface UserInter {
	public List<User> getAllUsers();
	public User getUserById(Long id);
	public User saveUser(User user);
	public User updateUser(User user ,Long id);
	public void deleteUser(Long id);
}

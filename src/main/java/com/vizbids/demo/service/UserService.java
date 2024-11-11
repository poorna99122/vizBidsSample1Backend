package com.vizbids.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vizbids.demo.model.User;
import com.vizbids.demo.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;
	 
	 public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public User getUserById(String userId) {
	        return userRepository.findById(userId).orElse(null);
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(String userId, User userDetails) {
	        User user = userRepository.findById(userId).orElse(null);
	        if (user != null) {
	            user.setPassword(userDetails.getPassword());
	            return userRepository.save(user);
	        }
	        return null;
	    }

	    public void deleteUser(String userId) {
	        userRepository.deleteById(userId);
	    }

}

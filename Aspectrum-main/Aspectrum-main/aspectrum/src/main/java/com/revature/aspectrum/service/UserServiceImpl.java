package com.revature.aspectrum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.aspectrum.model.User;
import com.revature.aspectrum.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userepo;
	
	public List<User> getAllUser(){
		return userepo.findAll();
	}
	
	public User getUserById(int id) {
		return userepo.findById(id).get();
	}
	
	public User register(User user) {
		return userepo.save(user);
	}
	public User update(User user) {
		return userepo.save(user);
	}
	
	public void deleteById(int id) {
		userepo.deleteById(id);
	}
	public User getByUsername(String username, String password) {
		 return userepo.findByUsername(username);
	}
	
	
	public User getByUsername(String username) {
		return userepo.findByUsername(username);
	}
	
	public User getProfileByUserName(String username) {
        // TODO Auto-generated method stub
        return userepo.findByUsername(username);
    }


    public User updateProfile(User user) {
        // TODO Auto-generated method stub
        return userepo.save(user);
    }
	 
	
	
}
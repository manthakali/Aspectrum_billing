package com.revature.aspectrum.service;

import java.util.List;



import com.revature.aspectrum.model.User;

public interface UserService {

	public List<User> getAllUser();
		
	public User getUserById(int id);
	
	public User register(User user);
	
	public User update(User user);
	
	public void deleteById(int id);
	
	public User getByUsername(String username);
	
	public User getProfileByUserName(String username);

    public User updateProfile(User user);
	
		
}

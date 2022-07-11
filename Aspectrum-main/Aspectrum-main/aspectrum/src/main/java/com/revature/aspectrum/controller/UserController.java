package com.revature.aspectrum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.aspectrum.model.User;
import com.revature.aspectrum.service.UserService;



@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spectrum";
	}

	
	@GetMapping("/data/users")
	public List<User> getAllUser() {
		return userService.getAllUser();

	}

	@GetMapping("/data/user/{id}")
	public User findUserById(@PathVariable int id) {
		return userService.getUserById(id);

	}

	@PostMapping("/data/add")
	public User register(@RequestBody User user) {
		return userService.register(user);

	}

	@PutMapping("/data/update/{id}")
	public User update(@PathVariable int id, @RequestBody User user) {
		return userService.update(user);

	}

	@DeleteMapping("/data/delete/{id}")
	public void deleteById(@PathVariable int id) {
		userService.deleteById(id);

	}
	
	@PostMapping("/data/login")
	public void login(@RequestBody String username) {
		userService.getByUsername(username);

		}
	@GetMapping("/data/myprofile/{username}")
    public User getProfileByUserName(@PathVariable String username) {
        return userService.getProfileByUserName(username);
    }

    @PutMapping("/data/editprofile")
    public User updateProfile(@RequestBody User user) {
        return userService.updateProfile(user);
    }
	
	
	}
	


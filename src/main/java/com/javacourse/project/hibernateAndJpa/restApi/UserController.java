package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.IUserService;
import com.javacourse.project.hibernateAndJpa.Entities.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private IUserService userService;

	@Autowired	
	public UserController(IUserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> get(){
		return userService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user) {
		this.userService.add(user);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody User user) {
		this.userService.update(user);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody User user) {
		this.userService.delete(user);
	}
	
	@GetMapping("/users/{id}")
	public User getById(@PathVariable int id) {
		return userService.getById(id);
	}
	
}

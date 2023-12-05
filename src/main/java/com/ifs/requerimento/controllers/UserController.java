package com.ifs.requerimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifs.requerimento.dto.RequirementDTO;
import com.ifs.requerimento.dto.UserDTO;
import com.ifs.requerimento.services.RequirementService;
import com.ifs.requerimento.services.UserService;

@RestController @RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RequirementService requirementService;
	
	@GetMapping
	public List<UserDTO> findAll(){
		return userService.findAll();
	}
	
	@GetMapping(value = "/{registration}")
	public UserDTO findByRegistration(@PathVariable Long registration){
		return userService.findByRegistration(registration);
	}
	
	@GetMapping(value = "/username/{username}")
	public UserDTO findByUsername(@PathVariable String username){
		return userService.findByUsername(username);
	}
	
	@GetMapping(value = "/email/{email}")
	public UserDTO findByEmail(@PathVariable String email){
		return userService.findByEmail(email);
	}
	
	@GetMapping(value = "/phoneNumber/{phoneNumber}")
	public UserDTO findByPhoneNumber(@PathVariable String phoneNumber){
		return userService.findByPhoneNumber(phoneNumber);
	}
	
	@GetMapping(value = "/search/{registrationName}")
	public List<UserDTO> findByRegistrationOrName(@PathVariable String registrationName){
		return userService.findByRegistrationOrName(registrationName);
	}
	
	@GetMapping(value = "/{registration}/requirements")
	public List<RequirementDTO> findByUser(@PathVariable Long registration){
		return requirementService.findByUser(registration);
	}
	
	@PostMapping
	public UserDTO insertUser(@RequestBody UserDTO data) {
		return userService.save(data);
	}
	
	@DeleteMapping(value = "/{registration}")
	public void deleteUser(@PathVariable Long registration) {
		userService.delete(registration);
	}
}

package com.ifs.requerimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifs.requerimento.dto.UserDTO;
import com.ifs.requerimento.services.UserService;

@RestController @RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserDTO> findAll(){
		return userService.findAll();
	}
	
	@GetMapping(value = "/{registration}")
	public UserDTO findByRegistration(@PathVariable Long registration){
		return userService.findByRegistration(registration);
	}
	
	@PostMapping
	public UserDTO insertUser(@RequestBody UserDTO data) {
		return userService.save(data);
	}
}

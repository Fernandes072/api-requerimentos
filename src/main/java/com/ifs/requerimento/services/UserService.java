package com.ifs.requerimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifs.requerimento.dto.UserDTO;
import com.ifs.requerimento.entities.User;
import com.ifs.requerimento.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll(){
		return userRepository.findAll().stream().map(x -> new UserDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public UserDTO findByRegistration(Long registration){
		return new UserDTO(userRepository.findById(registration).get());
	}
	
	@Transactional(readOnly = true)
	public UserDTO findByUsername(String username){
		return new UserDTO(userRepository.findByUsername(username));
	}
	
	@Transactional(readOnly = true)
	public UserDTO findByEmail(String email){
		return new UserDTO(userRepository.findByEmail(email));
	}
	
	@Transactional
	public UserDTO save(UserDTO data) {
		User newUser = new User(data);
		userRepository.save(newUser);
		return new UserDTO(newUser);
	}
}

package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.User;

public class UserDTO {
	
	private Long registration;
	private String password;

	public UserDTO(User entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public UserDTO() {
	}

	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

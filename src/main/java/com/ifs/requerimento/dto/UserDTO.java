package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.Course;
import com.ifs.requerimento.entities.User;

public class UserDTO {
	
	private Long registration;
	private String username;
	private String password;
	private String name;
	private String email;
	private Course course;

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
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}	
}

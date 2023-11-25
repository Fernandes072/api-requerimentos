package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.Course;
import com.ifs.requerimento.entities.User;
import com.ifs.requerimento.projections.UserProjection;

public class UserDTO {
	
	private Long registration;
	private String username;
	private String password;
	private String name;
	private String email;
	private Course courseId;

	public UserDTO(User entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public UserDTO(UserProjection projection) {
		BeanUtils.copyProperties(projection, this);
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

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}	
}

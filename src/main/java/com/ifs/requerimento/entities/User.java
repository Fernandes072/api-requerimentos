package com.ifs.requerimento.entities;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.dto.UserDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity @Table(name = "users")
public class User {
	
	@Id
	private Long registration;
	
	private String username;
	private String password;
	private String name;
	private String email;
	
	@ManyToOne @JoinColumn(name = "course_id")
	private Course course;
	
	public User(Long registration, String username, String password, String name, String email, Course course) {
		this.registration = registration;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public User(UserDTO entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public User() {
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

	@Override
	public int hashCode() {
		return Objects.hash(registration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(registration, other.registration);
	}
}

package com.ifs.requerimento.entities;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity @Table(name = "users")
public class User {
	
	@Id
	private Long registration;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	private String name;
	private String image;
	
	@Column(unique = true)
	private String email;
	
	@ManyToOne @JoinColumn(name = "course_id")
	private Course courseId;
	
	private String administrator;
	
	public User(Long registration, String username, String password, String name, String image, String email, Course courseId, String administrator) {
		this.registration = registration;
		this.username = username;
		this.password = password;
		this.name = name;
		this.image = image;
		this.email = email;
		this.courseId = courseId;
		this.administrator = administrator;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
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

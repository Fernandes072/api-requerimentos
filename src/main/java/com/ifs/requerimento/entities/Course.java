package com.ifs.requerimento.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "course_id")
	private Long courseId;
	
	private String name;

	public Course(Long id, String name) {
		this.courseId = id;
		this.name = name;
	}

	public Course() {
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long id) {
		this.courseId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseId, other.courseId);
	}
}

package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.Course;

public class CourseDTO {
	
	private Long courseId;
	private String name;

	public CourseDTO(Course entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public CourseDTO() {
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
}

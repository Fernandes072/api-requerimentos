package com.ifs.requerimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifs.requerimento.dto.CourseDTO;
import com.ifs.requerimento.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Transactional(readOnly = true)
	public List<CourseDTO> findAll(){
		return courseRepository.findAll().stream().map(x -> new CourseDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public CourseDTO findById(Long id){
		return new CourseDTO(courseRepository.findById(id).get());
	}
}

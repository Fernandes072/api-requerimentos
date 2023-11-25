package com.ifs.requerimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifs.requerimento.dto.CourseDTO;
import com.ifs.requerimento.services.CourseService;

@RestController @RequestMapping(value = "/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public List<CourseDTO> findAll(){
		return courseService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public CourseDTO findById(@PathVariable Long id){
		return courseService.findById(id);
	}
}

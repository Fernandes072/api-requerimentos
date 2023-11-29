package com.ifs.requerimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifs.requerimento.dto.RequerimentDTO;
import com.ifs.requerimento.dto.RequerimentMinDTO;
import com.ifs.requerimento.services.RequerimentService;

@RestController @RequestMapping(value = "/requeriments")
public class RequerimentController {
	
	@Autowired
	private RequerimentService requerimentService;
	
	@GetMapping
	public List<RequerimentDTO> findAll(){
//		List<RequerimentDTO> list = requerimentService.findAll();
//		Collections.reverse(list);
//		return list;
		return requerimentService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public RequerimentDTO findById(@PathVariable Long id) {
		return requerimentService.findById(id);
	}
	
	@GetMapping(value = "/search/{registrationRequerimentId}")
	public List<RequerimentDTO> findByRegistrationORRequerimentId(@PathVariable String registrationRequerimentId){
		return requerimentService.findByRegistrationOrRequerimentId(registrationRequerimentId);
	}
	
	@PostMapping
	public RequerimentDTO insertRequeriment(@RequestBody RequerimentMinDTO data) {
		return requerimentService.save(data);
	}
}

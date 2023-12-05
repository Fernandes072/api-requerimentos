package com.ifs.requerimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifs.requerimento.dto.RequirementDTO;
import com.ifs.requerimento.dto.RequirementMinDTO;
import com.ifs.requerimento.services.RequirementService;

@RestController @RequestMapping(value = "/requirements")
public class RequirementController {
	
	@Autowired
	private RequirementService requirementService;
	
	@GetMapping
	public List<RequirementDTO> findAll(){
//		List<RequerimentDTO> list = requerimentService.findAll();
//		Collections.reverse(list);
//		return list;
		return requirementService.findAll();
	}
	
	@GetMapping(value = "/{requirementId}")
	public RequirementDTO findById(@PathVariable Long requirementId) {
		return requirementService.findById(requirementId);
	}
	
	@GetMapping(value = "/search/{registrationRequirementId}")
	public List<RequirementDTO> findByRegistrationOrRequirementId(@PathVariable String registrationRequirementId){
		return requirementService.findByRegistrationOrRequirementId(registrationRequirementId);
	}
	
	@PostMapping
	public RequirementDTO insertRequirement(@RequestBody RequirementMinDTO data) {
		return requirementService.save(data);
	}
	
	@DeleteMapping(value = "/{requirementId}")
	public void deleteRequirement(@PathVariable Long requirementId) {
		requirementService.delete(requirementId);
	}
}

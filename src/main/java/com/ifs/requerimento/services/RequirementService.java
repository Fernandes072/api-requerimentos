package com.ifs.requerimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifs.requerimento.dto.RequirementDTO;
import com.ifs.requerimento.dto.RequirementMinDTO;
import com.ifs.requerimento.entities.Requirement;
import com.ifs.requerimento.repositories.RequirementRepository;

@Service
public class RequirementService {
	
	@Autowired
	private RequirementRepository requirementRepository;
	
	@Transactional(readOnly = true)
	public List<RequirementDTO> findAll(){
		return requirementRepository.findAll().stream().map(x -> new RequirementDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public RequirementDTO findById(Long requirementId) {
		return new RequirementDTO(requirementRepository.findById(requirementId).get());
	}
	
	@Transactional(readOnly = true)
	public List<RequirementDTO> findByUser(Long registration) {
		return requirementRepository.findByUser(registration).stream().map(x -> new RequirementDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<RequirementDTO> findByRegistrationOrRequirementId(String registrationRequirementId) {
		return requirementRepository.findByRegistrationOrRequirementId(registrationRequirementId).stream().map(x -> new RequirementDTO(x)).toList();
	}
	
	@Transactional
	public RequirementDTO save(RequirementMinDTO data) {
		Requirement newRequirement = new Requirement(data);
		requirementRepository.save(newRequirement);
		return new RequirementDTO(newRequirement);
	}
	
	@Transactional
	public void delete(Long requirementId) {
		requirementRepository.deleteById(requirementId);
	}
}

package com.ifs.requerimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifs.requerimento.dto.RequerimentDTO;
import com.ifs.requerimento.repositories.RequerimentRepository;

@Service
public class RequerimentService {
	
	@Autowired
	private RequerimentRepository requerimentRepository;
	
	@Transactional(readOnly = true)
	public List<RequerimentDTO> findAll(){
		return requerimentRepository.findAll().stream().map(x -> new RequerimentDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public RequerimentDTO findById(Long id) {
		return new RequerimentDTO(requerimentRepository.findById(id).get());
	}
	
	@Transactional(readOnly = true)
	public List<RequerimentDTO> findByRegistrationOrRequerimentId(String registrationRequerimentId) {
		return requerimentRepository.findByRegistrationOrRequerimentId(registrationRequerimentId).stream().map(x -> new RequerimentDTO(x)).toList();
	}
}

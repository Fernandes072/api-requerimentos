package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.Requeriment;
import com.ifs.requerimento.entities.User;

public class RequerimentDTO {
	
	private Long requerimentId;
	private User registration;
	private String type;
	private String specification;
	private String reason;
	
	public RequerimentDTO() {
		
	}

	public RequerimentDTO(Requeriment entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getRequerimentId() {
		return requerimentId;
	}

	public void setRequerimentId(Long requerimentId) {
		this.requerimentId = requerimentId;
	}

	public User getRegistration() {
		return registration;
	}

	public void setRegistration(User registration) {
		this.registration = registration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}

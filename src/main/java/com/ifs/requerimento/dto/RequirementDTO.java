package com.ifs.requerimento.dto;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.entities.Requirement;
import com.ifs.requerimento.entities.User;

public class RequirementDTO {
	
	private Long requirementId;
	private User registration;
	private String type;
	private String specification;
	private String reason;
	private String sendDate;
	
	public RequirementDTO() {
		
	}

	public RequirementDTO(Requirement entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(Long requirementId) {
		this.requirementId = requirementId;
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

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
}

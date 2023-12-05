package com.ifs.requerimento.entities;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.dto.RequirementDTO;
import com.ifs.requerimento.dto.RequirementMinDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity @Table(name="requirements")
public class Requirement {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="requirement_id")
	private Long requirementId;
	
	@ManyToOne @JoinColumn(name = "registration")
	private User registration;
	
	private String type;
	private String specification;
	private String reason;
	
	@Column(name = "send_date")
	private String sendDate;
	
	public Requirement() {
		
	}

	public Requirement(Long requirementId, User registration, String type, String specification, String reason, String sendDate) {
		this.requirementId = requirementId;
		this.registration = registration;
		this.type = type;
		this.specification = specification;
		this.reason = reason;
	}
	
	public Requirement(RequirementDTO entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public Requirement(RequirementMinDTO entity) {
		registration = entity.getRegistration();
		type = entity.getType();
		specification = entity.getSpecification();
		reason = entity.getReason();
		sendDate = entity.getSendDate();
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

	@Override
	public int hashCode() {
		return Objects.hash(requirementId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requirement other = (Requirement) obj;
		return Objects.equals(requirementId, other.requirementId);
	}
}

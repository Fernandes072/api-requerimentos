package com.ifs.requerimento.entities;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.ifs.requerimento.dto.RequerimentDTO;
import com.ifs.requerimento.dto.RequerimentMinDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity @Table(name="requeriments")
public class Requeriment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="requeriment_id")
	private Long requerimentId;
	
	@ManyToOne @JoinColumn(name = "registration")
	private User registration;
	
	private String type;
	private String specification;
	private String reason;
	
	@Column(name = "send_date")
	private String sendDate;
	
	public Requeriment() {
		
	}

	public Requeriment(Long requerimentId, User registration, String type, String specification, String reason, String sendDate) {
		this.requerimentId = requerimentId;
		this.registration = registration;
		this.type = type;
		this.specification = specification;
		this.reason = reason;
	}
	
	public Requeriment(RequerimentDTO entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	public Requeriment(RequerimentMinDTO entity) {
		registration = entity.getRegistration();
		type = entity.getType();
		specification = entity.getSpecification();
		reason = entity.getReason();
		sendDate = entity.getSendDate();
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

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(requerimentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requeriment other = (Requeriment) obj;
		return Objects.equals(requerimentId, other.requerimentId);
	}
}

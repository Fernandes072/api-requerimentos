package com.ifs.requerimento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ifs.requerimento.entities.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Long>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM requirements WHERE LOWER(registration) LIKE LOWER(CONCAT('%', :registrationRequirementId, '%')) OR LOWER(requirement_id) LIKE LOWER(CONCAT('%', :registrationRequirementId, '%'))")
	List<Requirement> findByRegistrationOrRequirementId(String registrationRequirementId);
	
	@Query(nativeQuery = true, value = "SELECT * FROM requirements WHERE registration = :registration")
	List<Requirement> findByUser(Long registration);

}

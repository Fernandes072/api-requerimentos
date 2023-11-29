package com.ifs.requerimento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ifs.requerimento.entities.Requeriment;

public interface RequerimentRepository extends JpaRepository<Requeriment, Long>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM requeriments WHERE LOWER(registration) LIKE LOWER(CONCAT('%', :registrationRequerimentId, '%')) OR LOWER(requeriment_id) LIKE LOWER(CONCAT('%', :registrationRequerimentId, '%'))")
	List<Requeriment> findByRegistrationOrRequerimentId(String registrationRequerimentId);

}

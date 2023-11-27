package com.ifs.requerimento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ifs.requerimento.entities.User;
import com.ifs.requerimento.projections.UserProjection;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE username = :username")
	UserProjection findByUsername(String username);
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE email = :email")
	UserProjection findByEmail(String email);
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE LOWER(registration) LIKE LOWER(CONCAT('%', :registrationName, '%')) OR LOWER(name) LIKE LOWER(CONCAT('%', :registrationName, '%'))")
	List<UserProjection> findByRegistrationOrName(String registrationName);
}

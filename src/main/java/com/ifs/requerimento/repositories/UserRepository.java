package com.ifs.requerimento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ifs.requerimento.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE username = :username")
	User findByUsername(String username);
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE email = :email")
	User findByEmail(String email);
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE LOWER(registration) LIKE LOWER(CONCAT('%', :registrationName, '%')) OR LOWER(CONCAT(first_name, ' ', last_name)) LIKE LOWER(CONCAT('%', :registrationName, '%'))")
	List<User> findByRegistrationOrName(String registrationName);
}

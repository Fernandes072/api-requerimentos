package com.ifs.requerimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifs.requerimento.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

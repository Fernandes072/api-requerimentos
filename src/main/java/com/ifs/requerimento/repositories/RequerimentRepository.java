package com.ifs.requerimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifs.requerimento.entities.Requeriment;

public interface RequerimentRepository extends JpaRepository<Requeriment, Long>{

}

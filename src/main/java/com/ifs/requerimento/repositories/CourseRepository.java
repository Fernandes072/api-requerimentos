package com.ifs.requerimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifs.requerimento.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}

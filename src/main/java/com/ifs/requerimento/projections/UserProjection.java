package com.ifs.requerimento.projections;

import com.ifs.requerimento.entities.Course;

public interface UserProjection {
	
	Long getRegistration();
	String getUsername();
	String getPassword();
	String getName();
	String getEmail();
	Course getCourseId();
}

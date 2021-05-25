package com.xworkz.ComModApp.repository;

import com.xworkz.ComModApp.entity.ComModEntity;

public interface ComModRepo {
	
	public Integer save(ComModEntity entity);
	
	public ComModEntity getByEmailId(String emailId);

}
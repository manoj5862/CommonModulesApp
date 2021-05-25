package com.xworkz.ComModApp.service;

import com.xworkz.ComModApp.dto.RegistrationDTO;

public interface RegistrationService {

	public String validateAndSave(RegistrationDTO dto);
}
package com.xworkz.details.service;

import com.xworkz.details.dto.DetailsDTO;

public interface DetailsService{
	boolean validateAndSave(DetailsDTO dto) throws ClassNotFoundException;
}

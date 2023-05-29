package com.xworkz.details.repo;

import com.xworkz.details.dto.DetailsDTO;

public interface DetailsRepository {
	boolean save(DetailsDTO dto) throws ClassNotFoundException;
}

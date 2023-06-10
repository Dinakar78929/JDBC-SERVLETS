package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.entity.CalenderEntity;

import antlr.collections.List;

public interface CalenderService {
	//save operation
	boolean validateAndSave(CalenderEntity entity);

	// Read operation
//	ArrayList<CalenderEntity> fetchCallender();

	// Update operation
	boolean updateCalender(CalenderEntity entity, Long t_id);

	// Delete operation
	boolean deleteCalenderById(Long t_id);
}

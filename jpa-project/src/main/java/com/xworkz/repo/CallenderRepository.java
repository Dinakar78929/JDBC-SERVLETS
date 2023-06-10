package com.xworkz.repo;

import java.util.ArrayList;

import com.xworkz.entity.CalenderEntity;

public interface CallenderRepository {
	boolean save(CalenderEntity entity);

//	ArrayList<CalenderEntity> fetchCallender();

	// Update operation
	boolean updateCalender(CalenderEntity entity, Long t_id);

	// Delete operation
	boolean deleteCalenderById(Long t_id);
}

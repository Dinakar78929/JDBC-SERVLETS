package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.entity.CalenderEntity;
import com.xworkz.repo.CallenderRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CalenderServiceImpl implements CalenderService {
	private CallenderRepository repository;

	@Override
	public boolean validateAndSave(CalenderEntity entity) {
		System.out.println("Running validate and save method");
		if (entity != null) {
			System.out.println("entity is not null");

			return this.repository.save(entity);

		} else {
			System.out.println("entity is null");
		}

		return false;
	}

//	@Override
//	public boolean fetchCallender() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean updateCalender(CalenderEntity entity, Long t_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCalenderById(Long t_id) {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.PlanetEntity;

public interface PlanetService {
	boolean validateAndSave(PlanetEntity entity);

	List<PlanetEntity> findAll();

	PlanetEntity findById(int id);

	List<PlanetEntity> findByName(String name);

	List<PlanetEntity> findByArea(int area);
	
	boolean update(String name,int id);
	
	boolean delete(int id);
	

}

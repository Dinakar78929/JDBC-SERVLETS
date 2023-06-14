package com.xworkz.repository;

import java.util.List;

import com.xworkz.entity.PlanetEntity;

public interface PlanetRepository {
	boolean save(PlanetEntity entity);
	
	List<PlanetEntity> findAll();
	
	PlanetEntity findById(int id);
	
	List<PlanetEntity> findByName(String name);
	
	List<PlanetEntity> findByArea(int area);
	
	boolean update(String name,int id);
	
	boolean delete(int id);

}

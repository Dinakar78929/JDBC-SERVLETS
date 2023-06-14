package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.PlanetEntity;
import com.xworkz.repository.PlanetRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PlanetServiceImpl implements PlanetService {
	private PlanetRepository repository;

	@Override
	public boolean validateAndSave(PlanetEntity entity) {
		System.out.println("Running validate and save method");
		return this.repository.save(entity);
	}

	@Override
	public List<PlanetEntity> findAll() {
		System.out.println("Running findAll method");
		return this.repository.findAll();
	}

	@Override
	public PlanetEntity findById(int id) {
		System.out.println("Running findById method");
		return this.repository.findById(id);
	}

	@Override
	public List<PlanetEntity> findByName(String name) {
		System.out.println("Running findByName method");
		return this.repository.findByName(name);
	}

	@Override
	public List<PlanetEntity> findByArea(int area) {
		System.out.println("Running findByArea method");
		return this.repository.findByArea(area);
	}

	@Override
	public boolean update(String name,int id) {
		System.out.println("Running update method");
		return this.repository.update(name, id);
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running delete method");
		return this.repository.delete(id);
	}

}

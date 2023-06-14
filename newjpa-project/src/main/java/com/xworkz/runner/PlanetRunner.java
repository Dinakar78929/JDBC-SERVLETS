package com.xworkz.runner;

import java.util.List;

import com.xworkz.entity.PlanetEntity;
import com.xworkz.repository.PlanetRepository;
import com.xworkz.repository.PlanetRepositoryImpl;
import com.xworkz.service.PlanetService;
import com.xworkz.service.PlanetServiceImpl;

public class PlanetRunner {
	public static void main(String[] args) {
		PlanetEntity entity = new PlanetEntity();
		entity.setId(6);
		
		entity.setDistance(600);
		entity.setArea(250);
		entity.setName("Jupiter");

		PlanetRepository repository = new PlanetRepositoryImpl();
		PlanetService service = new PlanetServiceImpl(repository);
		
		
		System.out.println("Saved:" + service.validateAndSave(entity));

//		List<PlanetEntity> list=service.findAll();
//		for (PlanetEntity planetEntity : list) {
//			System.out.println(planetEntity);
//		}

//		PlanetEntity planetEntity=service.findById(1);
//		System.out.println("FindById is:"+planetEntity);

		// System.out.println(service.findByName("Earth"));

	//	System.out.println(service.findByArea(150));
		
		
		//System.out.println("Updated "+service.update("Earth", 1));
		//System.out.println("Deleted"+service.delete(2));
	}
}

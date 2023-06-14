package com.xworkz.repository;

import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.PlanetEntity;

public class PlanetRepositoryImpl implements PlanetRepository {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean save(PlanetEntity entity) {
		System.out.println("Executing save method");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<PlanetEntity> findAll() {
		System.out.println("Executing findAll method");
		transaction.begin();
		Query query = manager.createNamedQuery("findAll");
		manager.close();
		return query.getResultList();
	}

	@Override
	public PlanetEntity findById(int id) {
		System.out.println("Executing findById method");
		transaction.begin();
		PlanetEntity planetEntity = manager.find(PlanetEntity.class, id);
		transaction.commit();
		manager.close();
		return planetEntity;
	}

	@Override
	public List<PlanetEntity> findByName(String name) {
		System.out.println("Executing findByName method");
		transaction.begin();
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("byName", name);
		return query.getResultList();
	}

	@Override
	public List<PlanetEntity> findByArea(int area) {
		System.out.println("Executing findByArea method");
		Query query = manager.createNamedQuery("findByArea");
		query.setParameter("byArea", area);
		return query.getResultList();
	}

	@Override
	public boolean update(String name,int id) {
		System.out.println("Executing update method");
		transaction.begin();
		PlanetEntity planetEntity=manager.find(PlanetEntity.class, id);
		System.out.println("Finding entity"+planetEntity);
		planetEntity.setName(name);
		manager.merge(planetEntity);
		transaction.commit();
		manager.close();
		
		System.out.println("After updation "+ planetEntity);
		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Executing delete method");
		transaction.begin();
		PlanetEntity planetEntity=manager.find(PlanetEntity.class, id);
		System.out.println("Finding entity"+planetEntity);
		manager.remove(planetEntity);
		transaction.commit();
		manager.close();
		return true;
	}



	

}

package com.xworkz.repo;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.CalenderEntity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CallenderRepositoryImpl implements CallenderRepository {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	EntityManager manager = factory.createEntityManager();
	
	@Override
	public boolean save(CalenderEntity entity) {

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.merge(entity);
		manager.close();
		System.out.println("Saved Data");
		return false;
	}

//	@Override
//	public ArrayList<CalenderEntity> fetchCallender() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean updateCalender(CalenderEntity entity, Long t_id) {
		manager.merge(entity);
		manager.close();
		System.out.println("Updated Data");
		return false;
	}

	@Override
	public boolean deleteCalenderById(Long t_id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		CalenderEntity mg = manager.find(CalenderEntity.class, 1);
		System.out.println(mg);
		manager.remove(mg);
		transaction.commit();
		factory.close();
		manager.close();
		System.out.println("Removed Data");
		return false;
	}

}

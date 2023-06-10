package com.xworkz.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.CalenderEntity;

public class CalenderRunner {
	public static void main(String[] args) {
		CalenderEntity entity = new CalenderEntity();
		entity.setId(1);
		entity.setName("dinakar");
		System.out.println(entity);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
//		manager.persist(entity);
//		transaction.commit();
//		manager.merge(entity);
//		manager.close();
//		System.out.println("Saved Data");

//		transaction.begin();
//		manager.merge(entity);
//		transaction.commit();
//		
//	
		CalenderEntity mg = manager.find(CalenderEntity.class, 1);
		System.out.println(mg);
		manager.remove(mg);
		transaction.commit();
		factory.close();
		manager.close();
		System.out.println("Removed Data");
	}

}

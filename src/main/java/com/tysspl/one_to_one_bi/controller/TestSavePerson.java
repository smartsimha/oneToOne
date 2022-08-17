package com.tysspl.one_to_one_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_one_bi.dto.Pan;
import com.tysspl.one_to_one_bi.dto.Person;

public class TestSavePerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Meghu");
		person.setAge(19);

		Pan pan = new Pan();
		pan.setPanNum("CKHGV3380B");
		pan.setFatherName("RAM");
		
		
		pan.setPerson(person);
		person.setPan(pan);

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.err.println("**********************data saved*******************");
	}

}

package com.tysspl.one_to_one_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tysspl.one_to_one_bi.dto.Pan;
import com.tysspl.one_to_one_bi.dto.Person;

public class GetPersonById {

	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, 1);
		System.out.println("Person name is------->"+person.getName());
		System.out.println("Person age is------->"+person.getAge());
		System.out.println("******************************************");
		
		Thread.sleep(3000);
		
//		Pan pan=person.getPan();
//		System.out.println("pan id is---->"+pan.getPanNum());
//		System.out.println("Father name is---->"+pan.getFatherName());
	}

}

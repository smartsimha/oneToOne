package com.tysspl.one_to_one_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_one_bi.dto.Company;
import com.tysspl.one_to_one_bi.dto.GST;

public class SaveCompany {

	public static void main(String[] args) {
		Company company = new Company();
		company.setName("tysspl");
		company.setAddress("Basavannagudi");

		GST gst = new GST();
		gst.setGstNumber("GST12114563");
		gst.setStatus("Active");

		company.setGst(gst);
		gst.setCompany(company);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}

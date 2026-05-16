package com.emp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.entity.EmpEntity;

@Repository
public class EmpDao {

	// declare the session so that all the methods can use them
	@Autowired
	SessionFactory factory;

	public String insertData(EmpEntity e) {

		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();

		ss.persist(e);

		tt.commit();
		ss.clear();
		return "Data inserted...";
	}

}

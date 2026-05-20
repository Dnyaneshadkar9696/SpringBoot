package com.customer.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerEntity;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory factory;

// insert data 
	public String insertData(CustomerEntity cs) {

		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();

		s.persist(cs);

		tt.commit();

		s.close();

		return "Data inserted...";

	}

	// delete data

	public String deletData(int id) {

		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();

		// Store the id of the entity in the reference

		// get is depricated so use find

		CustomerEntity e = ss.find(CustomerEntity.class, id);

		// we now soted the value of id in the customer entity

		ss.remove(e);
		// remove that object
		tt.commit();
		ss.close();

		return "Data is deleted....";

	}

	// update data

	public String updateData(CustomerEntity cs, int id) {

		Session sd = factory.openSession();
		Transaction tt = sd.beginTransaction();

		// fetch data and store in one entity
		CustomerEntity c1 = sd.find(CustomerEntity.class, id);

		// data fetched and stored in this object
		
		c1.setCustomerName(cs.getCustomerName());
		c1.setCustomerEmail(cs.getCustomerEmail());
		c1.setCustomerMobile(cs.getCustomerMobile());
		c1.setCustomerCity(cs.getCustomerCity());
		c1.setCustomerState(cs.getCustomerState());
		c1.setCustomerCountry(cs.getCustomerCountry());
		c1.setCustomerAge(cs.getCustomerAge());
		c1.setCustomerGender(cs.getCustomerGender());
		c1.setCustomerBalance(cs.getCustomerBalance());

		sd.merge(c1); // the old data one

		tt.commit();
		sd.close();

		return "Data is updated....";

	}
	
	// get a single record by id
	public CustomerEntity getDataById(int id) {
		
		// we are returing the customer entity.
		
		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();
		
		CustomerEntity c = s.find(CustomerEntity.class, id);
		
		tt.commit();
		
		s.close();
		
		return c;
		
	}
	
	// Get all the records
	
	public List<CustomerEntity> getAllData(){
		
		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();
		// used createquerey here
		// Using the get we can get the single record but for the all records we use the hql query.
		Query<CustomerEntity> q = s.createQuery("from CustomerEntity", CustomerEntity.class);
		
		List<CustomerEntity> list = q.list();
		
	
		tt.commit();
		s.close();
		
		return list;
		
	}
	
	
	

}

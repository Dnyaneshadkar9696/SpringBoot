package com.customer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerEntity;

@Repository
public class CustomerDao {
	
	@Autowired
	SessionFactory factory;
	
	
	public String insertData(CustomerEntity cs) {
		
		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();
		
		String hqlquery = "insert into customertable(customer_id, customer_name, customer_email, customer_mobile, customer_city, customer_state, customer_country, customer_age, customer_gender, customer_balance) values ( :id, :name, :email, :mobile, :city, :state, :country, :age, :gender, :balance)";
		
		MutationQuery q = s.createNativeMutationQuery(hqlquery);
		
		q.setParameter("id", cs.getCustomerId());
		q.setParameter("name", cs.getCustomerName());
		q.setParameter("email", cs.getCustomerEmail());
		q.setParameter("mobile", cs.getCustomerMobile());
		q.setParameter("city", cs.getCustomerCity());
		q.setParameter("state", cs.getCustomerState());
		q.setParameter("country", cs.getCustomerCountry());
		q.setParameter("age", cs.getCustomerAge());
		q.setParameter("gender", cs.getCustomerGender());
		q.setParameter("balance", cs.getCustomerBalance());
		
		q.executeUpdate();
		
		tt.commit();
		
		s.close();
		
		return "Data inserted...";
		
	}

}

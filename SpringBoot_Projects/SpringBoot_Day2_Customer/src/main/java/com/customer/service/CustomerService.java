package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDao;
import com.customer.entity.CustomerEntity;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao dd;
	
	public String insertData(CustomerEntity cs) {
		
		String sm = dd.insertData(cs);
		
		return sm;
	}

}

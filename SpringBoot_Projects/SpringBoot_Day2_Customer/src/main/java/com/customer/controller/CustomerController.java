package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.CustomerEntity;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService ssd;
	
	@PostMapping("/register")
	public String insertData(@RequestBody CustomerEntity cs) {
		
		String msd = ssd.insertData(cs);
		
		return msd;
	}

}

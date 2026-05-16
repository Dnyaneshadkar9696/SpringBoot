package com.hospi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospi.entity.HospitalEntity;
import com.hospi.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	HospitalService s;
	
	@PostMapping("/register")
	public String insertData(@RequestBody HospitalEntity he) {
		
		String ms = s.insertData(he);
		
		return ms;
	}

}

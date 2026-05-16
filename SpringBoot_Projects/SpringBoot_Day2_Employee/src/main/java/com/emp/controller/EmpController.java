package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.EmpEntity;
import com.emp.service.EmpService;


@RestController
public class EmpController {

	@Autowired
	EmpService ssd;

	@PostMapping("/register")
	public String insertData(@RequestBody EmpEntity e) {

		String msg = ssd.insertData(e);

		return msg;

	}

}

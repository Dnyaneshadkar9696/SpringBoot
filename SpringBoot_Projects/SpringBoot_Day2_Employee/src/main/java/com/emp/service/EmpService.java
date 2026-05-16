package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmpDao;
import com.emp.entity.EmpEntity;

@Service
public class EmpService {

	@Autowired
	EmpDao d;

	public String insertData(EmpEntity e) {

		String msg = d.insertData(e);

		return msg;

	}

}

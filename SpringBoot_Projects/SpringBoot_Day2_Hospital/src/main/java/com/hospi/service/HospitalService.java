package com.hospi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospi.dao.HospitalDao;
import com.hospi.entity.HospitalEntity;

@Service
public class HospitalService {

	@Autowired
	HospitalDao d;

	public String insertData(HospitalEntity he) {

		String mes = d.insertData(he);

		return mes;

	}

}

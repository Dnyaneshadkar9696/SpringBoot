package com.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dao.VehicleDao;
import com.vehicle.entity.VehicleEntity;

@Service
public class VehicleService {

	@Autowired
	VehicleDao d;

	public String insertData(VehicleEntity ve) {

		String msg = d.insertData(ve);

		return msg;
	}

}

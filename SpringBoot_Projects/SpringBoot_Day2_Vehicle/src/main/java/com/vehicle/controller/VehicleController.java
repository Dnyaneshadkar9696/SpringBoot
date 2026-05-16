package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService ssd;

	@PostMapping("/register")
	public String insertData(@RequestBody VehicleEntity ve) {

		String ms = ssd.insertData(ve);

		return ms;

	}

}

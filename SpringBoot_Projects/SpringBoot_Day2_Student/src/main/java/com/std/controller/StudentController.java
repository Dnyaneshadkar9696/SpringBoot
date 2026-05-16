package com.std.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.std.entity.StudentEntity;
import com.std.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ssd;

	@PostMapping("/register")
	public String insertData(@RequestBody List<StudentEntity> s) {

		String ms = ssd.insertData(s);

		return ms;

	}

}

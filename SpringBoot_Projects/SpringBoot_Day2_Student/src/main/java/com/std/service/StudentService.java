package com.std.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.Dao.StudentDao;
import com.std.entity.StudentEntity;

@Service
public class StudentService {
	
	@Autowired
	StudentDao d;
	
	public String insertData(List<StudentEntity> s) {
		
		// no need for object creation 
		
		String msg = d.insertData(s);
		
		return msg;
	}

}

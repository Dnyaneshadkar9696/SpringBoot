package com.std.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.std.entity.StudentEntity;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory factory;
	
	// we open the session in side the method
	
	// we declared Session Factory above because to use for all the methods
	
	public String insertData(List<StudentEntity> s) {
		
		Session sd = factory.openSession();
		Transaction tt = sd.beginTransaction();
		
		for(StudentEntity se : s) {
			sd.persist(se);
		}
		tt.commit();
		sd.close();
		
		return "Data inserted..";
		
		
	}
	
	

}

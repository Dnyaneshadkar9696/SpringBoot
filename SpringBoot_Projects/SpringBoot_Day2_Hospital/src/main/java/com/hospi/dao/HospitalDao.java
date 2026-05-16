package com.hospi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospi.entity.HospitalEntity;

@Repository
public class HospitalDao {

	@Autowired
	SessionFactory factory;

	public String insertData(HospitalEntity he) {

		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();

		String query = "insert into Hospi_table(hospi_id, hospi_name, hospi_staff, hospi_bed, hospi_doctor, hospi_ambulance, hospi_city, hospi_state, hospi_head, hospi_contact) values (:id, :name, :staff, :bed, :doctor, :ambulance, :city, :state, :head, :contact)";		
		MutationQuery m = s.createNativeMutationQuery(query);
		
		m.setParameter("id", he.getHospiId());
		m.setParameter("name", he.getHospiName());
		m.setParameter("staff", he.getHospiStaff());
		m.setParameter("bed", he.getHospiBed());
		m.setParameter("doctor", he.getHospiDoctor());
		m.setParameter("ambulance", he.getHospiAmbulance());
		m.setParameter("city", he.getHospiCity());
		m.setParameter("state", he.getHospiState());
		m.setParameter("head", he.getHospiHead());
		m.setParameter("contact", he.getHospiContact());
		
		
		m.executeUpdate();
		tt.commit();
		s.close();
		
		return "Data inserted....";
	}

}

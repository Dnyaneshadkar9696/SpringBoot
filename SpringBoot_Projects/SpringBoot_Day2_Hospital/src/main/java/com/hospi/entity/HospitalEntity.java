package com.hospi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HospiTable")
public class HospitalEntity {
	
	@Id
	private int hospiId;
	private String hospiName;
	private double hospiStaff;
	private int hospiBed;
	private int hospiDoctor;
	private int hospiAmbulance;
	private String hospiCity;
	private String hospiState;
	private String hospiHead;
	private long hospiContact;
	
	
	public HospitalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HospitalEntity(int hospiId, String hospiName, double hospiStaff, int hospiBed, int hospiDoctor,
			int hospiAmbulance, String hospiCity, String hospiState, String hospiHead, long hospiContact) {
		super();
		this.hospiId = hospiId;
		this.hospiName = hospiName;
		this.hospiStaff = hospiStaff;
		this.hospiBed = hospiBed;
		this.hospiDoctor = hospiDoctor;
		this.hospiAmbulance = hospiAmbulance;
		this.hospiCity = hospiCity;
		this.hospiState = hospiState;
		this.hospiHead = hospiHead;
		this.hospiContact = hospiContact;
	}


	public int getHospiId() {
		return hospiId;
	}


	public void setHospiId(int hospiId) {
		this.hospiId = hospiId;
	}


	public String getHospiName() {
		return hospiName;
	}


	public void setHospiName(String hospiName) {
		this.hospiName = hospiName;
	}


	public double getHospiStaff() {
		return hospiStaff;
	}


	public void setHospiStaff(double hospiStaff) {
		this.hospiStaff = hospiStaff;
	}


	public int getHospiBed() {
		return hospiBed;
	}


	public void setHospiBed(int hospiBed) {
		this.hospiBed = hospiBed;
	}


	public int getHospiDoctor() {
		return hospiDoctor;
	}


	public void setHospiDoctor(int hospiDoctor) {
		this.hospiDoctor = hospiDoctor;
	}


	public int getHospiAmbulance() {
		return hospiAmbulance;
	}


	public void setHospiAmbulance(int hospiAmbulance) {
		this.hospiAmbulance = hospiAmbulance;
	}


	public String getHospiCity() {
		return hospiCity;
	}


	public void setHospiCity(String hospiCity) {
		this.hospiCity = hospiCity;
	}


	public String getHospiState() {
		return hospiState;
	}


	public void setHospiState(String hospiState) {
		this.hospiState = hospiState;
	}


	public String getHospiHead() {
		return hospiHead;
	}


	public void setHospiHead(String hospiHead) {
		this.hospiHead = hospiHead;
	}


	public long getHospiContact() {
		return hospiContact;
	}


	public void setHospiContact(long hospiContact) {
		this.hospiContact = hospiContact;
	}


	@Override
	public String toString() {
		return "HospitalEntity [hospiId=" + hospiId + ", hospiName=" + hospiName + ", hospiStaff=" + hospiStaff
				+ ", hospiBed=" + hospiBed + ", hospiDoctor=" + hospiDoctor + ", hospiAmbulance=" + hospiAmbulance
				+ ", hospiCity=" + hospiCity + ", hospiState=" + hospiState + ", hospiHead=" + hospiHead
				+ ", hospiContact=" + hospiContact + "]";
	}
	
	
	
	

}

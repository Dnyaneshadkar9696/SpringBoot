package com.std.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StudentEntity {

	// to set the id as primary key
	@jakarta.persistence.Id
	private int stdID;
	@Column(nullable = false)
	private String stdName;
	@Column(unique = true)
	private int stdRollNo;
	private String stdCity;
	private String stdBloodG;
	private long stdMobnum;
	private String stdCollegeName;
	private String stdEmail;
	private float std10Th_perc;
	private float std12Th_perc;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int stdID, String stdName, int stdRollNo, String stdCity, String stdBloodG, long stdMobnum,
			String stdCollegeName, String stdEmail, float std10Th_perc, float std12Th_perc) {
		super();
		
	
		this.stdID = stdID;
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdCity = stdCity;
		this.stdBloodG = stdBloodG;
		this.stdMobnum = stdMobnum;
		this.stdCollegeName = stdCollegeName;
		this.stdEmail = stdEmail;
		this.std10Th_perc = std10Th_perc;
		this.std12Th_perc = std12Th_perc;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public String getStdBloodG() {
		return stdBloodG;
	}

	public void setStdBloodG(String stdBloodG) {
		this.stdBloodG = stdBloodG;
	}

	public long getStdMobnum() {
		return stdMobnum;
	}

	public void setStdMobnum(long stdMobnum) {
		this.stdMobnum = stdMobnum;
	}

	public String getStdCollegeName() {
		return stdCollegeName;
	}

	public void setStdCollegeName(String stdCollegeName) {
		this.stdCollegeName = stdCollegeName;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public float getStd10Th_perc() {
		return std10Th_perc;
	}

	public void setStd10Th_perc(float std10Th_perc) {
		this.std10Th_perc = std10Th_perc;
	}

	public float getStd12Th_perc() {
		return std12Th_perc;
	}

	public void setStd12Th_perc(float std12Th_perc) {
		this.std12Th_perc = std12Th_perc;
	}

	@Override
	public String toString() {
		return "StudentEntity [stdID=" + stdID + ", stdName=" + stdName + ", stdRollNo=" + stdRollNo + ", stdCity="
				+ stdCity + ", stdBloodG=" + stdBloodG + ", stdMobnum=" + stdMobnum + ", stdCollegeName="
				+ stdCollegeName + ", stdEmail=" + stdEmail + ", std10Th_perc=" + std10Th_perc + ", std12Th_perc="
				+ std12Th_perc + "]";
	}

}

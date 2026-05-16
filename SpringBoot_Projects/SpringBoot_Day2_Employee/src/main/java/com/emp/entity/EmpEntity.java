package com.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpEntity {

	@Id
	private int empId;
	private String empName;
	private String empCity;
	private int empMob;
	private String empDepartment;
	private String empJoinDate;
	private double empSalary;
	private String empExp;
	private float empHikeperc;
	private boolean empMarried;
	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpEntity(int empId, String empName, String empCity, int empMob, String empDepartment, String empJoinDate,
			double empSalary, String empExp, float empHikeperc, boolean empMarried) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empMob = empMob;
		this.empDepartment = empDepartment;
		this.empJoinDate = empJoinDate;
		this.empSalary = empSalary;
		this.empExp = empExp;
		this.empHikeperc = empHikeperc;
		this.empMarried = empMarried;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getEmpMob() {
		return empMob;
	}
	public void setEmpMob(int empMob) {
		this.empMob = empMob;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpExp() {
		return empExp;
	}
	public void setEmpExp(String empExp) {
		this.empExp = empExp;
	}
	public float getEmpHikeperc() {
		return empHikeperc;
	}
	public void setEmpHikeperc(float empHikeperc) {
		this.empHikeperc = empHikeperc;
	}
	public boolean isEmpMarried() {
		return empMarried;
	}
	public void setEmpMarried(boolean empMarried) {
		this.empMarried = empMarried;
	}
	@Override
	public String toString() {
		return "EmpEntity [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empMob=" + empMob
				+ ", empDepartment=" + empDepartment + ", empJoinDate=" + empJoinDate + ", empSalary=" + empSalary
				+ ", empExp=" + empExp + ", empHikeperc=" + empHikeperc + ", empMarried=" + empMarried + "]";
	}

}

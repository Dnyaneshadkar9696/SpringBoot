package com.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicalTable")
public class VehicleEntity {
	
	@Id
	private int vehicleId;
	private String vehicleName;
	private String vehicleBrand;
	private String vehicleType;
	private String vehicleColor;
	private double vehiclePrice;
	private String vehicleFuelType;
	private int vehicleModelYear;
	private String vehicleOwner;
	private long vehicleNumber;
	
	
	public VehicleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleEntity(int vehicleId, String vehicleName, String vehicleBrand, String vehicleType,
			String vehicleColor, double vehiclePrice, String vehicleFuelType, int vehicleModelYear, String vehicleOwner,
			long vehicleNumber) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.vehiclePrice = vehiclePrice;
		this.vehicleFuelType = vehicleFuelType;
		this.vehicleModelYear = vehicleModelYear;
		this.vehicleOwner = vehicleOwner;
		this.vehicleNumber = vehicleNumber;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleName() {
		return vehicleName;
	}


	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	public String getVehicleBrand() {
		return vehicleBrand;
	}


	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getVehicleColor() {
		return vehicleColor;
	}


	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}


	public double getVehiclePrice() {
		return vehiclePrice;
	}


	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}


	public String getVehicleFuelType() {
		return vehicleFuelType;
	}


	public void setVehicleFuelType(String vehicleFuelType) {
		this.vehicleFuelType = vehicleFuelType;
	}


	public int getVehicleModelYear() {
		return vehicleModelYear;
	}


	public void setVehicleModelYear(int vehicleModelYear) {
		this.vehicleModelYear = vehicleModelYear;
	}


	public String getVehicleOwner() {
		return vehicleOwner;
	}


	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}


	public long getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(long vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	@Override
	public String toString() {
		return "VehicleEntity [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleBrand="
				+ vehicleBrand + ", vehicleType=" + vehicleType + ", vehicleColor=" + vehicleColor + ", vehiclePrice="
				+ vehiclePrice + ", vehicleFuelType=" + vehicleFuelType + ", vehicleModelYear=" + vehicleModelYear
				+ ", vehicleOwner=" + vehicleOwner + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
	
	
	
	

}

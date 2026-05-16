package com.vehicle.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.VehicleEntity;

@Repository
public class VehicleDao {

	@Autowired
	SessionFactory factory;

	public String insertData(VehicleEntity ve) {

		Session s = factory.openSession();
		Transaction tt = s.beginTransaction();

		// our fields will become the coloumn
		String hqlQuery = "insert into vehical_table( vehicle_id, vehicle_name, vehicle_brand, vehicle_type, vehicle_color, vehicle_price, vehicle_fuel_type, vehicle_model_year, vehicle_owner, vehicle_number) values ( :id, :name, :brand, :type, :color, :price, :fueltype, :modelyear, :owner, :number)";

		MutationQuery q = s.createNativeMutationQuery(hqlQuery);

		q.setParameter("id", ve.getVehicleId());
		q.setParameter("name", ve.getVehicleName());
		q.setParameter("brand", ve.getVehicleBrand());
		q.setParameter("type", ve.getVehicleType());
		q.setParameter("color", ve.getVehicleColor());
		q.setParameter("price", ve.getVehiclePrice());
		q.setParameter("fueltype", ve.getVehicleFuelType());
		q.setParameter("modelyear", ve.getVehicleModelYear());
		q.setParameter("owner", ve.getVehicleOwner());
		q.setParameter("number", ve.getVehicleNumber());

		q.executeUpdate();

		tt.commit();
		s.close();

		return "Data inserted....";
	}

}

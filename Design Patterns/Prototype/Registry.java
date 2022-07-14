package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<VehicleType, Vehicle> vehicle = new HashMap<>();
	
	public Registry() {
		this.initialize();
	}
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehi=null;
		try {
			 vehi = (Vehicle) vehicle.get(vehicleType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vehi;
	}
	
	private void initialize() {
		Car car = new Car();
		car.setEngineVapacity(2000);
		car.setType("Mini");
		car.setFuelType("Petrol");
		
		Bus bus = new Bus();
		bus.setNoOfSeats(50);
		bus.setEngineVapacity(3009);
		bus.setFuelType("Diesel");
		
		vehicle.put(VehicleType.CAR,car);
		vehicle.put(VehicleType.BUS,bus);
	}
}
package test;

import tech.nikant.components.EngineType;
import tech.nikant.components.Vehicle;
import tech.nikant.factory.VehicleFactory;

public class Client2 {
	public static void main(String[] args) {
		try {
			Vehicle vehicle=VehicleFactory.getInstance(EngineType.CNG);
			vehicle.startJounery("Bangaluru", "Delhi");
			}
			catch(IllegalArgumentException iae) {
				iae.printStackTrace();
			}
	}
}

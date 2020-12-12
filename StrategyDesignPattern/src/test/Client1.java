package test;

import tech.nikant.components.EngineType;
import tech.nikant.components.Vehicle;
import tech.nikant.factory.VehicleFactory;

public class Client1 {
	public static void main(String[] args) {
		try {
			Vehicle vehicle=VehicleFactory.getInstance(EngineType.DIESEL);
			vehicle.startJounery("Patna", "Chandigarh");
			}
			catch(IllegalArgumentException iae) {
				iae.printStackTrace();
			}
	}
}

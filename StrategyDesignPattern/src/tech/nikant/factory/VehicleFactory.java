package tech.nikant.factory;

import tech.nikant.components.CNGEngine;
import tech.nikant.components.DieselEngine;
import tech.nikant.components.EngineType;
import tech.nikant.components.IEngine;
import tech.nikant.components.PetrolEngine;
import tech.nikant.components.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getInstance(EngineType engineType) {
		IEngine engine = null;
		
		if(engineType.equals(EngineType.PETROL)) {
			engine = new PetrolEngine();
		}
		
		else if(engineType.equals(EngineType.DIESEL)) {
			engine = new DieselEngine();
		}
		
		else if(engineType.equals(EngineType.CNG)) {
			engine = new CNGEngine();
		}
		
		else
			throw new IllegalArgumentException("Invalid Engine Type");
		
		//creating target class object
		Vehicle vehicle = new Vehicle();
		vehicle.setEngine(engine);
		
		return vehicle;
		
		
	}
	
}

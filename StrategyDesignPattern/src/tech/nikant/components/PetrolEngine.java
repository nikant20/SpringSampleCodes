package tech.nikant.components;

public class PetrolEngine implements IEngine{

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}

}

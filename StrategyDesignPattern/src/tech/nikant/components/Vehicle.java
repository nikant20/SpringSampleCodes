package tech.nikant.components;

public class Vehicle {
	private IEngine engine;
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void startJounery(String source, String destination) {
		engine.start();
		System.out.println("Jounery started at::"+source);
		System.out.println("Jouney is going on .........");
		engine.stop();
		System.out.println("Jounery ended at::"+destination);
	}
}

package com.qa.model;

public class cars extends Vehicle {
	
	private int engineSize;
	private String model;
	private boolean petrol;
	
	
	
	


	public cars(String colour, boolean used, int seats, int engineSize, String model, boolean petrol) {
		super(colour, used, seats);
		this.engineSize = engineSize;
		this.model = model;
		this.petrol = petrol;
	}


	public int getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public boolean isPetrol() {
		return petrol;
	}


	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}
	
	@Override
	public String toString() {
		return "cars[engineSize=" + engineSize + ", model=" + model + ", petrol=" + petrol + "]";
		
	}
	
	

}

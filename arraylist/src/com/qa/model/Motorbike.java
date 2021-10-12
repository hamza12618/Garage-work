package com.qa.model;

public class Motorbike extends Vehicle {
	private String model;
	private int ccSize;
	private boolean turbo;
	
	
	

	public Motorbike(String colour, boolean used, int seats, String model, int ccSize, boolean turbo) {
		super(colour, used, seats);
		this.model = model;
		this.ccSize = ccSize;
		this.turbo = turbo;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getCcSize() {
		return ccSize;
	}


	public void setCcSize(int ccSize) {
		this.ccSize = ccSize;
	}


	public boolean isTurbo() {
		return turbo;
	}


	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	
@Override
public String toString() {
	return "Motorbike[model=" + model + ", ccSize=" + ccSize + ", turbo=" + turbo + "]";
	
}
}

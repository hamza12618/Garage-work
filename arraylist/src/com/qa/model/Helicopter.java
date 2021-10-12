package com.qa.model;

public class Helicopter extends Vehicle{
	private String model;
	private int propella;
	private boolean conatins4seats;
	
	
	
	public Helicopter(String colour, boolean used, int seats, String model, int propella, boolean conatins4seats) {
		super(colour, used, seats);
		this.model = model;
		this.propella = propella;
		this.conatins4seats = conatins4seats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPropella() {
		return propella;
	}
	public void setPropella(int propella) {
		this.propella = propella;
	}
	public boolean isConatins4seats() {
		return conatins4seats;
	}
	public void setConatins4seats(boolean conatins4seats) {
		this.conatins4seats = conatins4seats;
	}
	
	@Override
	public String toString() {
		return "Helicopter[model=" + model + ", propella=" + propella + ", contains4seats=" + conatins4seats + "]";

}
}
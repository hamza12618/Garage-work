package com.qa.model;

public class Vehicle {

	
	private String colour;
	private boolean used;
	private int seats;
	
	
	public Vehicle(String colour, boolean used, int seats) {
		super();
		this.colour = colour;
		this.used = used;
		this.seats = seats;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}

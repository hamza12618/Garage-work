package com.qa.model;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> VehicleList = new ArrayList<>();
	
	cars bmwCar = new cars("Blue", false, 5,3, "BMW", true);
	cars audiCar = new cars("white", true, 2, 5, "Audi", false);
	
	
	public void addcars( ) {
		System.out.println(VehicleList);
		VehicleList.add(bmwCar);
		System.out.println(VehicleList);
	}
	


Helicopter RRHelicopter = new Helicopter("Black", true, 8, "RR", 8, true);
Helicopter BentleyHelicopter = new Helicopter("Yellow", false, 9, "Bentley", 10, false);

public void addHelicopter( ) {
	System.out.println(VehicleList);
	VehicleList.add(RRHelicopter);
	System.out.println(VehicleList);


Motorbike DucattiMotorbike = new Motorbike("Blue", true, 5, "Ducatti", 1000, true);
Motorbike YamahaMotorbike = new Motorbike("Red", false, 3, "Yamaha", 128, false);}

public void addMotorbike( ) {
	System.out.println(VehicleList);
	VehicleList.add(audiCar);
	System.out.println(VehicleList);
}





	public static int multiply(int x, int y) {
		return x * y
}

}






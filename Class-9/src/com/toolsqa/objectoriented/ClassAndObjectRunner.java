package com.toolsqa.objectoriented;

public class ClassAndObjectRunner {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle(7, 4);
		
		v.printVehicleInfo();
		
		v.accelerate();
		v.accelerate();
		v.accelerate(23);
		
		v.printVehicleInfo();
		
		Car c = new Car();


	}

}

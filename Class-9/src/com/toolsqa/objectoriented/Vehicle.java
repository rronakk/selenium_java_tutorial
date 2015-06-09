package com.toolsqa.objectoriented;

public class Vehicle {

	// 1. Data Members
	int numberOfTyres ;//=4;
	String steeringType; //= "Manual";
	int currentSpeed;
	// Primitive Data Types will be intiailzed automatically to respective values
	// int, float - 0
	// char - ' '
	// boolean - false
	// Object  - null
	
	// 2. Methods
	
	
	// Constructor - 
	// same name as that of class
	// It should not have any return type (not even void)
	Vehicle()
	{
		numberOfTyres = 4;
		steeringType = "Manual";
		currentSpeed = 10;
	}
	
	Vehicle(int numberOfTyres, int currrentSpeed)
	{
		this.numberOfTyres = numberOfTyres;
		this.currentSpeed= currrentSpeed;
	}
	
	void printVehicleInfo()
	{
		System.out.println("Tyres: "+numberOfTyres);
		System.out.println("Steering Type: "+steeringType);
		System.out.println("CurrentSpeed: "+currentSpeed);
	}
	
	int getCurrentSpeed()
	{
		return currentSpeed;
	}
	
	// Overloading
	int accelerate()
	{
		currentSpeed = currentSpeed + 20;
		return currentSpeed;
	}
	
	int accelerate(int incrementSpeed)
	{
		currentSpeed = currentSpeed + incrementSpeed;
		return currentSpeed;
	}
	
}

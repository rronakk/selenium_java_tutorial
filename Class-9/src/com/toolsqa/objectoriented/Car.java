package com.toolsqa.objectoriented;


// Single Inheritance
// Multiple Inheritance - A class can extend more than one class
public class Car extends Vehicle {

	// A mandate if another constructor with params is added
	Car()
	{
		
	}
	
	Car(int numTyres, int currentSpeed)
	{
		if(numTyres!=4)
		{
			// Report Error
		}
	}
	
	void superAccelerate(){
		super.accelerate();
	}
	
	
	int accelerate(int incrementSpeed)
	{
		if(incrementSpeed >= 100){
			System.out.println("Cant Increase the speed");
			return 0;
		}
		currentSpeed = currentSpeed + incrementSpeed;
		return currentSpeed;
	}

}

package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// Vehicles : name, colour, unique attribute
		// Car = numberOfDoors
		// Bus = numtotApproval
		// Motorcycle = CoolnessFactor
		Vehicle aCar = new Car("Buggie", "Yellow", 5);
		Vehicle aBus = new Bus("Double-Decker", "Green", 80.0);
		Vehicle aMotorcycle = new Motorcycle("Hot-Rod", "Black", 580);
		Vehicle bendyBoi = new Bus("Bendy-Boi", "", 200.0);
		// list - creates an instance of list and adds objects above in it
		Garage vehicles = new Garage();
		vehicles.addVehicle(aCar);
		vehicles.addVehicle(aBus);
		vehicles.addVehicle(aMotorcycle);
		vehicles.addVehicle(bendyBoi);

		// aCar.drive(); // method prints to the console

	}

}

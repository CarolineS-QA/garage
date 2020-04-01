package com.qa.main;

public class Car extends Vehicle {

	private int numberOfDoors = 5;

	public Car(String carName, String colour, int numberOfDoors) {
		super("Car", 4, "Black", 350); // name, number of wheels, colour, pollutionRating
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public void drive() {
		int speed = 70;
		String drive = "Vrrrr... driving smoothly \n @" + speed + "mph";
		System.out.println(drive);
	}

	@Override
	public void breakdown() {
		// TODO Auto-generated method stub
		System.out.println("Car needs repair.");
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public float calcBill() {
		float carBill = (float) 300.50;
		System.out.println("Your bill: " + carBill);
		return carBill;
	}

}

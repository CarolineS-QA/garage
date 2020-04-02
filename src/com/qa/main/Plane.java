package com.qa.main;

public class Plane extends Vehicle implements Flyable {

	public Plane(String name, int numberOfWheels, String colour, int pollutionRating) {
		super(name, numberOfWheels, colour, pollutionRating);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public float calcBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub

	}

	public void landing() {
		// TODO Auto-generated method stub

	}
}

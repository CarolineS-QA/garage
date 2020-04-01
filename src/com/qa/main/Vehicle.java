package com.qa.main;

public abstract class Vehicle {

	private String name;
	private int numberOfWheels;
	private String colour;
	private int pollutionRating;

	// this is passed on to each vehicle
	public Vehicle(String name, int numberOfWheels, String colour, int pollutionRating) {
		super();
		this.setName(name);
		this.numberOfWheels = numberOfWheels;
		this.colour = colour;
		this.pollutionRating = pollutionRating;
	}

	public abstract void drive();

	public abstract void breakdown();

	// add bill calc for garage
	public abstract float calcBill();

	public int getPollutionRating() {
		return pollutionRating;
	}

	public void setPollutionRating(int pollutionRating) {
		this.pollutionRating = pollutionRating;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getNoise() {
		return colour;
	}

	public void setNoise(String noise) {
		this.colour = noise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

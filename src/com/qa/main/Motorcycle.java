package com.qa.main;

public class Motorcycle extends Vehicle implements Offroadable {

	private long coolnessFactor = 9001;

	public Motorcycle(String bikeName, String colour, long coolnessFactor) {
		super("Motorcycle", 2, "Red", 500); // name, number of wheels, colour, pollutionRating
		this.coolnessFactor = coolnessFactor;
	}

	@Override
	public void drive() {
		int speed = 300;
		String drive = "Vroom vroom! \n @" + speed + "mph";
		System.out.println(drive);
	}

	@Override
	public void breakdown() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle needs repair.");

	}

	public long getCoolnessFactor() {
		return coolnessFactor;
	}

	public void setCoolnessFactor(long coolnessFactor) {
		this.coolnessFactor = coolnessFactor;
	}

	@Override
	public String toString() {
		return "Motorcycle has a coolnessFactor: " + coolnessFactor + "\n";
	}

	@Override
	public float calcBill() {
		float motorBill = (float) 600.50;
		System.out.println("Your bill: " + motorBill);
		return motorBill;
	}

	@Override
	public void dirtydriving() {
		// TODO Auto-generated method stub

	}

}

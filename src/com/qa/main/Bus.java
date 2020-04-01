package com.qa.main;

public class Bus extends Vehicle {

	private double numtotApproval = 110.00;

	public Bus(String busName, String colour, double numtotApproval) {
		super("Bus", 4, "Blue", 50); // name, number of wheels, colour, pollutionRating
		this.numtotApproval = numtotApproval;
	}

	@Override
	public void drive() {
		int speed = 30;
		String drive = "Beep-beep. Transporting people \n @" + speed + "mph";
		System.out.println(drive);
	}

	@Override
	public void breakdown() {
		// TODO Auto-generated method stub
		System.out.println("Bus needs repair.");

	}

	public double getNumtotApproval() {
		return numtotApproval;
	}

	public void setNumtotApproval(double numtotApproval) {
		this.numtotApproval = numtotApproval;
	}

	@Override
	public float calcBill() {
		float busBill = (float) 550.50;
		System.out.println("Your bill: " + busBill);
		return busBill;
	}

}

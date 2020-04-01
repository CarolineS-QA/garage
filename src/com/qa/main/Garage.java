package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicleStore = new ArrayList<>();

	public boolean addVehicle(Vehicle v) {
		return this.vehicleStore.add(v);
	}

	public boolean removeVehicle(Vehicle v) {
		return this.vehicleStore.remove(v);
	}

	// part 3
	public float calcBill() {
		return 0;
	}
//	public String printList(String all) {
//		for (Vehicle all : vehicleStore) {
//			System.out.println();
//			return "";
//		}
//		return "";
//	}
}

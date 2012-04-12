package utils;

import models.Boat;

public class MarinaFactory {

	public static final String BOAT_NAME = "Boat Name";

	public static Boat boat() {
		return boat(BOAT_NAME);
	}
	
	public static Boat boat(String name) {
		return new Boat(name);
	}
}

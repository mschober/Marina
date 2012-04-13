package utils;

import models.Boat;
import models.Size;

public class MarinaFactory {

	public static final String BOAT_NAME = "Boat Name";

	public static Boat boat() {
		return boat(BOAT_NAME);
	}
	
	public static Boat boat(String name) {
		return new Boat(name);
	}

	public static Size size() {
		return size(0, 0);
	}

	public static Size size(int length, int beam) {
		return new Size(length, beam);
	}
}

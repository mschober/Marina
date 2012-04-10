package utils;

import models.Boat;
import models.Slip;

public class MarinaHelper {

	private static Slip lookForSlip(String property, Object value) {
		return Slip.find(property, value).first();
	}
	
	private static Boat lookForBoat(String property, String name) {
		return Boat.find(property, name).first();
	}

	public static Slip lookForSlip(String value) {
		return lookForSlip("byName", value);
	}

	public static Boat lookForBoat(String name) {
		return lookForBoat("byName", name); 
	}

}

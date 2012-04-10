package utils;

import models.Slip;

public class MarinaHelper {

	public static Slip lookFor(String property, Object value) {
		return Slip.find(property, value).first();
	}

	public static Slip lookFor(String value) {
		return lookFor("byName", value);
	}

}

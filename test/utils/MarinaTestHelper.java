package utils;

import models.Boat;
import models.Slip;

public class MarinaTestHelper {

	public static void shouldNotFindSlip(String value) {
		org.junit.Assert.assertNull(MarinaHelper.lookForSlip(value));
	}

	public static void shouldFindSlips(String[] names) {
		for(String s : names)
			findSlip(s);
	}
	
	private static void findSlip(String name) {
		Slip slip = MarinaHelper.lookForSlip(name);
		shouldFindSlip(name, slip);
	}


	private static void shouldFindSlip(String name, Slip slip) {
		org.junit.Assert.assertNotNull("couldnt find " + slip.getClass().getSimpleName() + " for: " + name, slip);
		org.junit.Assert.assertEquals(name, slip.name);
	}

	public static void assertThree(long count) {
		org.junit.Assert.assertEquals(3, count);
	}

	public static void shouldFindBoats(String[] names) {
		for(String s: names)
			findBoat(s);
	}

	private static void findBoat(String name) {
		Boat boat = MarinaHelper.lookForBoat(name);
		shouldFindBoat(name, boat);
	}

	private static void shouldFindBoat(String name, Boat boat) {
		org.junit.Assert.assertNotNull("couldnt find " + boat.getClass().getSimpleName() + " for: " + name, boat);
		org.junit.Assert.assertEquals(name, boat.name);
	}

	public static void shouldNotFindBoat(String value) {
		org.junit.Assert.assertNull(MarinaHelper.lookForBoat(value));
	}

}

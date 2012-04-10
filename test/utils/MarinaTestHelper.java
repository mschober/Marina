package utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Boat;
import models.Slip;

public class MarinaTestHelper {

	public static void shouldNotFindSlip(String value) {
		assertNull(MarinaHelper.lookForSlip(value));
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
		assertNotNull("couldnt find slip for: " + name, slip);
		assertEquals(name, slip.name);
	}

	public static void assertThree(long count) {
		assertEquals(3, count);
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
		assertNotNull("couldnt find boat for: " + name, boat);
		assertEquals(name, boat.name);
	}

	public static void shouldNotFindBoat(String value) {
		assertNull(MarinaHelper.lookForBoat(value));
	}

	public static void assertTwo(long count) {
		assertEquals(2, count);
	}
}

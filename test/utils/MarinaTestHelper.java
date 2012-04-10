package utils;

import models.Slip;

public class MarinaTestHelper {

	public static void shouldNotFindSlip(String value) {
		org.junit.Assert.assertNull(MarinaHelper.lookFor(value));
	}

	public static void shouldFindSlips(String[] names) {
		for(String s : names)
			findSlip(s);
	}
	
	private static void findSlip(String name) {
		Slip slip = MarinaHelper.lookFor(name);
		shouldFindSlip(name, slip);
	}


	private static void shouldFindSlip(String name, Slip slip) {
		org.junit.Assert.assertNotNull("couldnt find slip for: " + name, slip);
		org.junit.Assert.assertEquals(name, slip.name);
	}

	public static void assertThree(long count) {
		org.junit.Assert.assertEquals(3, count);
	}

}

package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;
import utils.MarinaFactory;

public class SlipTest extends UnitTest {

	private Slip slip;

	@Before
	public void setUp() throws Exception {
		slip = new Slip("A50", null);
	}

	@Test
	public void printSlip() {
		assertEquals("[A50]: ", slip.toString());
		Slip slip2 = new Slip("A51", MarinaFactory.boat());
		assertEquals("[A51]: " + MarinaFactory.BOAT_NAME, slip2.toString());
		
		
		assertEquals("[A50]: " + "\nLength: 0, Beam: 0", slip.toFullString());
		assertEquals("[A51]: " + MarinaFactory.BOAT_NAME.concat("\nLength: 0, Beam: 0"), slip2.toFullString());
		
		slip.setLength(10).setBeam(20);
		slip2.setBeam(52).setLength(35);
		assertEquals("[A50]: " + "\nLength: 10, Beam: 20", slip.toFullString());
		assertEquals("[A51]: " + MarinaFactory.BOAT_NAME.concat("\nLength: 35, Beam: 52"), slip2.toFullString());
		
	}

}

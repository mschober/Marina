package models;

import static org.junit.Assert.*;
import static utils.MarinaFactory.*;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;
import utils.MarinaFactory;
import utils.MarinaHelper;

public class SlipTest extends UnitTest {

	private Slip emptySlip;
	private Slip filledSlip;

	@Before
	public void setUp() throws Exception {
		emptySlip = new Slip("A50", null);
		filledSlip = new Slip("A51", boat());
	}

	@Test
	public void regularToString() {
		assertEquals(Slip.formatName("A50"), emptySlip.toString());
		assertEquals(Slip.formatName("A51") + boat(), filledSlip.toString());
	}

	@Test
	public void fullToString() {
		assertEquals(Slip.formatName(emptySlip.name, emptySlip.size), emptySlip.toFullString());
		assertEquals(Slip.formatName(filledSlip.name, filledSlip.size) + boat(), filledSlip.toFullString());
	}
	
	@Test
	public void fullToStringWithSets() {
		emptySlip.setLength(10).setBeam(20);
		filledSlip.setBeam(52).setLength(35);
		assertEquals(Slip.formatName(emptySlip.name, emptySlip.size), emptySlip.toFullString());
		assertEquals(Slip.formatName(filledSlip.name, filledSlip.size) + filledSlip.boat, filledSlip.toFullString());
	}

}

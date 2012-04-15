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
	private Slip defaultSlip;

	@Before
	public void setUp() throws Exception {
		defaultSlip = new Slip();
		emptySlip = new Slip("A50", MarinaFactory.size(), null);
		filledSlip = new Slip("A51", MarinaFactory.size(), boat());
	}

	@Test
	public void regularToString() {
		assertEquals(Slip.formatName("New Slip"), defaultSlip.toString());
		assertEquals(Slip.formatName("A50"), emptySlip.toString());
		assertEquals(Slip.formatName("A51") + boat(), filledSlip.toString());
	}

	@Test
	public void fullToString() {
		fullStringMatches(defaultSlip, formatSlipName("New Slip", MarinaFactory.size()));
		fullStringMatches(emptySlip, formatSlipName(emptySlip.name, emptySlip.size));
		fullStringMatches(filledSlip, formatSlipName(filledSlip.name, filledSlip.size) + boat());
	}

	private void fullStringMatches(Slip slip, String expectedFullString) {
		assertEquals(expectedFullString, slip.toFullString());
	}

	private String formatSlipName(String name, Size size) {
		return Slip.formatName(name, size);
	}
	
	@Test
	public void fullToStringWithSets() {
		emptySlip.setLength(10).setBeam(20);
		filledSlip.setBeam(52).setLength(35);
		assertEquals(Slip.formatName(emptySlip.name, emptySlip.size), emptySlip.toFullString());
		assertEquals(Slip.formatName(filledSlip.name, filledSlip.size) + filledSlip.boat, filledSlip.toFullString());
	}

}

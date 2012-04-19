package models;

import static utils.MarinaFactory.boat;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;
import utils.MarinaFactory;

public class SlipTest extends UnitTest {
	
	private Slip emptySlip;
	private Slip filledSlip;
	private Slip defaultSlip;
	private Slip created;

	@Before
	public void setUp() throws Exception {
		created = new Slip("name", new Size(0,0));
		defaultSlip = new Slip();
		emptySlip = new Slip("A50", MarinaFactory.size(), null);
		filledSlip = new Slip("A51", MarinaFactory.size(), boat());


	}

	@Test
	public void test() {
		assertNotNull(created);
		assertEquals("name", created.toString());
		assertNotNull(created.size);
	}

	@Test
	public void regularToString() {
		assertEquals(Slip.NEW_SLIP, defaultSlip.toString());
		assertEquals("A50", emptySlip.toString());
		assertEquals("A51" + boat(), filledSlip.toString());
	}

}

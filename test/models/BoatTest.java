package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;
import utils.MarinaFactory;

public class BoatTest extends UnitTest {

	private Boat boat;

	@Before
	public void setUp() throws Exception {
		boat = MarinaFactory.boat();
	}

	@Test
	public void printBoat() {
		assertEquals(MarinaFactory.BOAT_NAME.concat(MarinaFactory.size().toString()), boat.toString());
	}
	
	@Test
	public void ownerDoesntKnowBoatSize(){
		boat.setSize(null);
		assertEquals(MarinaFactory.BOAT_NAME, boat.toString());
	}

}

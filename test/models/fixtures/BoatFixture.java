package models.fixtures;

import static org.junit.Assert.*;

import models.Boat;

import org.junit.Test;

import sun.nio.cs.ext.MacHebrew;
import utils.MarinaHelper;
import utils.MarinaTestHelper;

public class BoatFixture extends MarinaFixture {

	@Test
	public void counts() {
		MarinaTestHelper.assertThree(Boat.count());
	}
	
	@Test
	public void findByName(){
		Boat boat = MarinaHelper.lookForBoat("Sail Boat");
		assertEquals("Sail Boat", boat.name);
		
		MarinaTestHelper.shouldFindBoats(new String[] {"", "Sail Boat", "Power Boat"});
		MarinaTestHelper.shouldNotFindBoat("woogy");
	}

}

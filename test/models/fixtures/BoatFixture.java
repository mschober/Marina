package models.fixtures;

import static org.junit.Assert.*;

import models.Boat;

import org.junit.Test;

public class BoatFixture extends MarinaFixture {

	@Test
	public void counts() {
		assertEquals(3, Boat.count());
	}
	
	@Test
	public void findByName(){
		Boat boat = Boat.find("byName", "Sail Boat").first();
		assertEquals("Sail Boat", boat.name);
	}

}

package models.fixtures;

import static org.junit.Assert.*;

import models.Slip;

import org.junit.Before;
import org.junit.Test;

public class SlipFixture extends MarinaFixture {

	@Test
	public void counts() {
		assertEquals(3, Slip.count());
	}

}

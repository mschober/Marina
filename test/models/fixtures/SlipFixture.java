package models.fixtures;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Boat;
import models.Slip;

import org.junit.Before;
import org.junit.Test;

import utils.MarinaHelper;
import utils.MarinaTestHelper;

public class SlipFixture extends MarinaFixture {

	@Test
	public void counts() {
		MarinaTestHelper.assertThree(Slip.count());
		MarinaTestHelper.assertThree(Boat.count());
	}
	
	@Test
	public void findByName(){
		MarinaTestHelper.shouldFindSlips(new String[] {"A1", "A2", "A3"});
		MarinaTestHelper.shouldNotFindSlip("A4");
	}
}

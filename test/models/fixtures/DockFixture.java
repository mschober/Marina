package models.fixtures;

import static org.junit.Assert.*;

import models.Dock;

import org.junit.Before;
import org.junit.Test;

import play.db.jpa.GenericModel.JPAQuery;

//import fixtures.MarinaFixture;

public class DockFixture extends MarinaFixture {
	
	@Before
	public void loadData(){
		super.prepDatabase(DataFile.DOCKS);
	}

	@Test
	public void counts() {
		assertEquals(3, Dock.count());
		
		correctSlipCount(5, "A Dock");
		correctSlipCount(5, "B Dock");
		correctSlipCount(5, "C Dock");
	}

	private void correctSlipCount(int count, String dockName) {
		Dock aDock = Dock.find("byName", dockName).first();
		assertEquals(count, aDock.slips.size());
	}

}

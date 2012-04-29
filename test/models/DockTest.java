package models;

import static org.junit.Assert.*;

import org.junit.Test;

import play.test.UnitTest;

public class DockTest extends UnitTest {

	@Test
	public void createADock(){
		Dock aDock = new Dock(null, null);
		assertNotNull(aDock);
		
	}

}

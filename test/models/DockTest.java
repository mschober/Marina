package models;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;

public class DockTest extends UnitTest {

	private Dock aDock;

	
	@Before
	public void setup(){
		aDock = new Dock(null, null);
	}

	@Test
	public void createADock(){
		assertNotNull(aDock);
	}
	
	@Test
	public void printedDefinition(){
		assertEquals("Dock[]", aDock.toString());
	}

	@Test
	public void withSlips(){
		Slip[] slips = new Slip[]{new Slip(), new Slip()};
		aDock = createADock(slips);
		assertEquals(2, aDock.slipCount());
	}

	private Dock createADock(Slip... slips) {
		return new Dock("A Dock", Arrays.asList(slips));
	}

}

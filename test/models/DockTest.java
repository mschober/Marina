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
		assertEquals("Unnamed\n[New Slip]", aDock.toString());
	}

	@Test
	public void withSlips(){
		aDock = createADock(new Slip("A1"), new Slip("A2"));
		assertEquals(2, aDock.slipCount());
		assertEquals("A Dock\n[A1, A2]", aDock.toString());
	}
	
	@Test
	public void sorted(){
		aDock = createADock(new Slip("A2"), new Slip("A1"));
		assertEquals(2, aDock.slipCount());
		assertEquals("A Dock\n[A1, A2]", aDock.toString());
	}

	private Dock createADock(Slip... slips) {
		return new Dock("A Dock", Arrays.asList(slips));
	}

}

package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;
import utils.MarinaFactory;

public class SizeTest extends UnitTest {

	private Size size;

	@Before
	public void setUp() throws Exception {
		size = MarinaFactory.size(); 
	}

	@Test
	public void printSize() {
		assertEquals(Size.format(size), size.toString());
		
		size.setBeam(45).setLength(1);
		assertEquals(Size.format(MarinaFactory.size(1, 45)), size.toString());
		
		size.setLength(12).setBeam(32);
		assertEquals(Size.format(MarinaFactory.size(12, 32)), size.toString());

	}

}

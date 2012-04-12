package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;

public class SizeTest extends UnitTest {

	private Size size;

	@Before
	public void setUp() throws Exception {
		size = new Size(20, 35);
	}

	@Test
	public void printSize() {
		assertEquals("Length: 20".concat(", ").concat("Beam: 35"), size.toString());
		
		size.setBeam(45).setLength(1);
		assertEquals("Length: 1".concat(", ").concat("Beam: 45"), size.toString());
		
		size.setLength(12).setBeam(32);
		assertEquals("Length: 12".concat(", ").concat("Beam: 32"), size.toString());

	}

}

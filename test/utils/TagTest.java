package utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TagTest {

	@Test
	public void test() {
		assertEquals("<title>myTitle</title>", new Tag("title", "myTitle").toString());
	}
	
	@Test
	public void testTwo() {
		assertEquals("<h1>myHeader</h1>", new Tag("h1", "myHeader").toString());
	}
}

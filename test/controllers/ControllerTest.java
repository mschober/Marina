package controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import play.mvc.Http.Response;
import play.test.FunctionalTest;
import play.test.UnitTest;

public class ControllerTest extends FunctionalTest{

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Response response = GET('/');
		assertNotNull(response);
		
	}

}

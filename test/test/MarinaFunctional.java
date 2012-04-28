package test;

import play.mvc.Http.Response;
import play.test.FunctionalTest;
import utils.Tag;

public abstract class MarinaFunctional extends FunctionalTest {
	
	protected void titleShouldBe(String title, Response response) {
		assertContentMatch(new Tag("title", title).toString(), response);
	}

}

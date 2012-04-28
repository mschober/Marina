import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import test.MarinaFunctional;
import models.*;

public class ApplicationTest extends MarinaFunctional {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentMatch("Slips:", response);
        titleShouldBe("Marina", response);
    }
    
}
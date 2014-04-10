package controllers.unit;

import org.junit.Test;

import play.mvc.Result;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class InputPersonDetailsTest {

	@Test
	public void callIndex() {
		Result result = callAction(controllers.routes.ref.InputPersonDetails
				.createPerson());
		assertThat(status(result)).isEqualTo(OK);
		assertThat(contentType(result)).isEqualTo("text/html");
		assertThat(charset(result)).isEqualTo("utf-8");
		assertThat(contentAsString(result)).contains("First Name*");
		assertThat(contentAsString(result)).contains("Last Name*");
		assertThat(contentAsString(result)).contains("Age");
		assertThat(contentAsString(result)).contains("* Denotes Required Field");
		assertThat(contentAsString(result)).contains("Submit");
	}
}

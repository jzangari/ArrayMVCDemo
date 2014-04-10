package controllers.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import play.mvc.Result;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ReviewPersonDetailsTest {

	@Test
	public void testReviewPersonController() throws Exception {
		Result result = callAction(
				controllers.routes.ref.ReviewPersonDetails.reviewPerson(),
				fakeRequest().withFormUrlEncodedBody(
						ImmutableMap.of("firstName", "Joshua", "lastName",
								"Zangari", "age", "28")));
		assertThat(status(result)).isEqualTo(OK);
		assertThat(contentType(result)).isEqualTo("text/html");
		
		assertThat(contentAsString(result)).contains("First Name");
		assertThat(contentAsString(result)).contains("Joshua");
		
		assertThat(contentAsString(result)).contains("Last Name");
		assertThat(contentAsString(result)).contains("Zangari");
		
		assertThat(contentAsString(result)).contains("Age");
		assertThat(contentAsString(result)).contains("28");
		
		assertThat(contentAsString(result)).contains("Submit");
	}
}

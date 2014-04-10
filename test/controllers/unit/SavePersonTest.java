package controllers.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import play.mvc.Result;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class SavePersonTest {

	@Test
	public void testReviewPersonController() throws Exception {
		running(fakeApplication(inMemoryDatabase()), new Runnable() {
			public void run() {
				Result result = callAction(
						controllers.routes.ref.SavePerson.savePerson(),
						fakeRequest().withFormUrlEncodedBody(
								ImmutableMap.of("firstName", "Joshua",
										"lastName", "Zangari", "age", "28")));
				assertThat(status(result)).isEqualTo(OK);
				assertThat(contentType(result)).isEqualTo("text/html");

				assertThat(contentAsString(result)).contains(
						"Welcome Joshua Zangari.");

				// The Javascript that populates and makes this change cannot run. 
				// assertThat(contentAsString(result)).contains(
				// ",your age is 28.");
			}
		});
	}
}

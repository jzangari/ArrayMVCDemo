package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.reviewPersonDetails;

/**
 * Controller for reviewing a person's details.
 * 
 * @author Joshua
 * 
 */
public class ReviewPersonDetails extends Controller {

	/**
	 * Post method controller which accepts a {@link Person} form submission and
	 * returns the rendered view {@link reviewPersonDetails};
	 * 
	 * @return {@link Result} with a rendered {@link reviewPersonDetails} view;
	 */
	public static Result reviewPerson() {

		Person person = Person.buildPersonFromDynamicForm(Form.form()
				.bindFromRequest());

		return ok(reviewPersonDetails.render(person));
	}

}

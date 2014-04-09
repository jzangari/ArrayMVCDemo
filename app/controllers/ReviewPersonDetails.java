package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.reviewPersonDetails;

public class ReviewPersonDetails extends Controller {

	public static Result reviewPerson() {

		Person person = Person.buildPersonFromDynamicForm(Form.form()
				.bindFromRequest());

		return ok(reviewPersonDetails.render(person));
	}

}

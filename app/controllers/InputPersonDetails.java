package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.inputPersonDetails;

/**
 * Controller for inputting person details.
 * 
 * @author Joshua
 * 
 */
public class InputPersonDetails extends Controller {

	/**
	 * Controller method for showing the view {@link inputPersonDetails}.
	 * 
	 * @return {@link Result} containing page for creating a person.
	 */
	public static Result createPerson() {
		return ok(inputPersonDetails.render());
	}

}

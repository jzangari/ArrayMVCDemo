package controllers;

import models.Person;

import org.apache.commons.lang3.StringUtils;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.inputPersonDetails;
import views.html.reviewPersonDetails;

/**
 * Controller for inputting person details. 
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
		return ok(views.html.inputPersonDetails.render());
	}

}

package controllers;

import models.Person;

import org.apache.commons.lang3.StringUtils;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.reviewPersonDetails;

public class InputPersonDetails extends Controller {

	public static Result createPerson() {
		return ok(views.html.inputPersonDetails.render());
	}



}

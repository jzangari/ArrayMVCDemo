package controllers;

import models.Person;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class SavePerson extends Controller {
	
	public static Result savePerson() {
		Person person = Person.buildPersonFromDynamicForm(Form.form()
				.bindFromRequest());
		
		Logger.debug(person.getAge());
		
		person.save();
        return ok(welcomePerson.render(person));
	}
}

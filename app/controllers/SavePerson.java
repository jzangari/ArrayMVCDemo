package controllers;

import models.Person;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Controller for saving a person. 
 * @author Joshua
 *
 */
public class SavePerson extends Controller {
	
	/**
	 * Post method controller which accepts a {@link Person} form submission and
	 * returns the rendered view {@link welcomePerson};
	 * 
	 * @return {@link Result} with a rendered {@link welcomePerson} view;
	 */
	public static Result savePerson() {
		Person person = Person.buildPersonFromDynamicForm(Form.form()
				.bindFromRequest());
		
		Logger.debug(person.getAge());
		
		person.save();
        return ok(welcomePerson.render(person));
	}
}

package controllers;

import org.apache.commons.lang3.StringUtils;

import models.Person;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.reviewPersonDetails;

public class ReviewPersonDetails extends Controller {
    
	public static Result reviewPerson() {
    	
		DynamicForm form = Form.form().bindFromRequest();
    	Person person = new Person();
    	
    	person.setFirstName(form.get("firstName"));
    	
    	person.setLastName(form.get("lastName"));
    	
    	if (StringUtils.isNotBlank(form.get("age")))
    		person.setAge(Integer.parseInt(form.get("age")));
    	
        return ok(reviewPersonDetails.render(person));
    }
}

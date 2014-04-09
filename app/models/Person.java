package models;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import play.data.DynamicForm;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Person extends Model {

	/**
	 * Generated SerialVersionUID
	 */
	private static final long serialVersionUID = -2401112324577974442L;

	@Id
	private String id;

	@Required
	private String firstName;

	@Required
	private String lastName;

	@Nullable
	private String age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * Builds a {@link Person} object from a {@link DynamicForm} with fields named the same as the ones in a {@link Person}
	 * @param form {@link DynamicForm} with fields: firstname, lastName, and age
	 * @return Person constructed by 
	 */
	public static Person buildPersonFromDynamicForm(DynamicForm form) {
    	Person person = new Person();
    	
    	person.setFirstName(form.get("firstName"));
    	
    	person.setLastName(form.get("lastName"));
    	
    	if (StringUtils.isNotBlank(form.get("age")))
    		person.setAge(form.get("age"));
    	else
    		person.setAge(null);
		return person;
	}
}

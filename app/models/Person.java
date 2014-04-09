package models;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.Id;

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
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

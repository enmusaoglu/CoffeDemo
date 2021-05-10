package entities;

import java.util.Date;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationallyId;
	
	public Customer() {}

	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationallyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationallyId = nationallyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationallyId() {
		return nationallyId;
	}

	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}


}

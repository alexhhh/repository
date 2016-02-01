/**
 * 
 */
package com.intern.alexx.model;
 

/**
 * @author malex
 *
 */
public class Mester {

	private int idMester;
	private String firstName;
	private String lastName;
	private String location;
	private String description;
	private Contact contact;
	private Speciality speciality;
	private ReviewMester reviewMester;
	
	public Mester() {

	}

	public Mester(int idMester, String firstName, String lastName, String description, String location) {
		// TODO Auto-generated constructor stub
		this.idMester=idMester;
		this.firstName=firstName;
		this.lastName=lastName;
		this.description=description;
		this.location=location;
	}

	/**
	 * @return the id
	 */
	public int getIdMester() {
		return idMester;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setIdMester(int idMester) {
		this.idMester = idMester;
	}

 

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/**
	 * @return the speciality
	 */
	public Speciality getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return the reviewMester
	 */
	public ReviewMester getReviewMester() {
		return reviewMester;
	}

	/**
	 * @param reviewMester the reviewMester to set
	 */
	public void setReviewMester(ReviewMester reviewMester) {
		this.reviewMester = reviewMester;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mester [idMester=" + idMester + ", fisrtName=" + firstName + ", lastName=" + lastName + ", description="
				+ description + ", location=" + location + "]";
	}
	
	
}

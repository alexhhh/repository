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

	private String fisrtName;
	private String lastName;
	// private Speciality speciality;
	private String description;
	// private Contact contact;
	private String location;


	public Mester() {

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
	 * @return the fisrtName
	 */
	public String getFisrtName() {
		return fisrtName;
	}

	/**
	 * @param fisrtName
	 *            the fisrtName to set
	 */
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
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

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mester [idMester=" + idMester + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", description="
				+ description + ", location=" + location + "]";
	}
	
	
}

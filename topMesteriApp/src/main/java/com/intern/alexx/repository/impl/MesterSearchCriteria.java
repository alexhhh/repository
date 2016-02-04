package com.intern.alexx.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;

public class MesterSearchCriteria {

	private String firstName;
	private String lastName;
	private String location;
	private String specialityName;
	private String email;
	private String phoneNumber;
	private Integer rating;
	private String price;

	@Autowired
	MesterSearchCriteriaBuilder builder = new MesterSearchCriteriaBuilder();

	MesterSearchCriteria mesterCriteria = builder.setFirstName(firstName).setLastName(lastName).setLocation(location)
			.SetSpecialityName(specialityName).setEmail(email).setPhoneNumber(phoneNumber).setRating(rating)
			.setPrice(price).create();

	public MesterSearchCriteria() {
		this(null, null, null, null, null, null, null, null);
	}

	public MesterSearchCriteria(String firstName, String lastName, String location, String specialityName, String email,
			String phoneNumber, Integer rating, String price) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.specialityName = specialityName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.price = price;

	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
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
	 * @return the specialityName
	 */
	public String getSpecialityName() {
		return specialityName;
	}

	/**
	 * @param specialityName
	 *            the specialityName to set
	 */
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the numarTelefon
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param numarTelefon
	 *            the numarTelefon to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MesterSearchCriteria [fisrtName=" + firstName + "lastName=" + lastName + ", location=" + location
				+ ", speciality=" + specialityName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", rating="
				+ rating + ", price=" + price + "]";
	}

}

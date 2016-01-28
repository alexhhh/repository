/**
 * 
 */
package com.intern.alexx.model;

/**
 * @author malex
 *
 */
public class Client {

	private int idClient;
	private String fisrtName;
	private String lastName;
	
	public Client(){}

	/**
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the fisrtName
	 */
	public String getFisrtName() {
		return fisrtName;
	}

	/**
	 * @param fisrtName the fisrtName to set
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
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

/**
 * 
 */
package model;

import java.util.Arrays;

/**
 * @author malex
 *
 */
public class ContactImp {
	
	private Contact contact;
	
	private String telNr;
	private String email;
	private String site;
	private String[] profile;
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
	 * @return the telNr
	 */
	public String getTelNr() {
		return telNr;
	}
	/**
	 * @param telNr the telNr to set
	 */
	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}
	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	/**
	 * @return the profile
	 */
	public String[] getProfile() {
		return profile;
	}
	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String[] profile) {
		this.profile = profile;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactImp [contact=" + contact + ", telNr=" + telNr + ", email=" + email + ", site=" + site
				+ ", profile=" + Arrays.toString(profile) + "]";
	}

}

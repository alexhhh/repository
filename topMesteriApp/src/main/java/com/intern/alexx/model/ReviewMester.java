/**
 * 
 */
package com.intern.alexx.model;

/**
 * @author malex
 *
 */
public class ReviewMester {

	private int idReviewMester;
	private String price;
	private int rating;
	private String feedback;
	
	public ReviewMester(){}

	/**
	 * @return the idReviewMester
	 */
	public int getIdReviewMester() {
		return idReviewMester;
	}

	/**
	 * @param idReviewMester the idReviewMester to set
	 */
	public void setIdReviewMester(int idReviewMester) {
		this.idReviewMester = idReviewMester;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
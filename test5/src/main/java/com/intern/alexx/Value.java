/**
 * 
 */
package com.intern.alexx;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author malex
 * any properties not bound in this type should be ignored
 */

@JsonIgnoreProperties
public class Value {

	private int id;
	private String quote;
	
	private Value(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}
	
	
	
}

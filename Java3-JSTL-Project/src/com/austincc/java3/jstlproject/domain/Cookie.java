package com.austincc.java3.jstlproject.domain;

import java.io.Serializable;

public class Cookie implements Serializable {
	
	// Enum for the types of Cookies we support
	public enum CookieType {
	    PEANUT_BUTTER, SNICKER_DOODLE, BUTTER__PECAN, FUDGE,
	    CUSTARD_CREAM, GINGERBREAD, TOLL_HOUSE 
	}

	// Instance variables
	private Cookie.CookieType type;

	// Class methods
	public static int numberOfTypesOfCookies() {
		return CookieType.values().length - 1;
	}
	
	// Constructor
	public Cookie(CookieType type) {
		super();
		this.type = type;
	}

	
	// Instance Methods
	
	// Getters and Setters
	public Cookie.CookieType getType() {
		return type;
	}

	public void setType(Cookie.CookieType type) {
		this.type = type;
	}
	
	public String getCookieTypeString() {
		return type.toString();
	}
	
	public int getHashCode() {
		return hashCode();
	}
	
	
	
}

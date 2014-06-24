/**
 * 
 */
package domain;


import java.util.ArrayList;

import domain.treats.Cookie;

/**
 * @author samjr
 *
 */
public class Customer {
	
	private ArrayList<Cookie> myCookies;

	/**
	 * @return the myCookies
	 */
	public ArrayList<Cookie> getMyCookies() {
		return myCookies;
	}

	/**
	 * @param myCookies the myCookies to set
	 */
	public void setMyCookies(ArrayList<Cookie> myCookies) {
		this.myCookies = myCookies;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [myCookies=" + myCookies + "]";
	}
	
	

}

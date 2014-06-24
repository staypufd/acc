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
public class Store {
	
	private ArrayList<Cookie> cookiesArrayList = new ArrayList<Cookie>();

	/**
	 * 
	 */
	public Store() {
		super();
		Cookie aCookie = new Cookie("Peanutbutter", 2);
		Cookie aCookie2 = new Cookie("Chocalate Chip", 2);
		Cookie aCookie3 = new Cookie("Snickerdoodle", 3);
		cookiesArrayList.add(aCookie);
		cookiesArrayList.add(aCookie2);
		cookiesArrayList.add(aCookie3);
	}

	// Getters and Setters
	/**
	 * @return the cookiesArrayList
	 */
	private ArrayList<Cookie> getCookiesArrayList() {
		return cookiesArrayList;
	}

	/**
	 * @param cookiesArrayList the cookiesArrayList to set
	 */
	private void setCookiesArrayList(ArrayList<Cookie> cookiesArrayList) {
		this.cookiesArrayList = cookiesArrayList;
	}

	// Behaviors
	public ArrayList<Cookie> whatCookiesAreAvailable() {
		return getCookiesArrayList();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Store [cookiesArrayList=" + cookiesArrayList + "]";
	}

	public void customerEnterStore(Customer customer1) {
		// TODO Auto-generated method stub
		System.out.println("Ding! Ding!");
	}

	
	public ArrayList<Cookie> pickSomeCookies(String cookieType, int theNumberOfCookiesTheCustomerWants) {
		
		ArrayList<Cookie> foundCookies = new ArrayList<>();
		
		
		for (Cookie cookie : cookiesArrayList) {
			if (cookie.getKind().equalsIgnoreCase(cookieType)) {
				if (foundCookies.size() <= theNumberOfCookiesTheCustomerWants) {
					// Add the found cookie
					foundCookies.add(cookie);
				}
			}
		}
		
		// Remove the found cookies from the stores cookies
		for (Cookie cookie : foundCookies) {
			cookiesArrayList.remove(cookie);
		}
		
		// Did we give them enough cookies?  If not then tell them how many we gave them
		if (foundCookies.size() < theNumberOfCookiesTheCustomerWants) {
			System.out.println("Sorry we don't have enought cookies for the number number you wanted!");
			System.out.println("We gave you what we had, which was " + foundCookies.size() + " cookie");
		}
		
		return foundCookies;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

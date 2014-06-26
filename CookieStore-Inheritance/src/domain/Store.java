/**
 * 
 */
package domain;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import domain.treats.Cake;
import domain.treats.Candy;
import domain.treats.ConfectionaryItem;
import domain.treats.Cookie;

/**
 * @author samjr
 *
 */
public class Store {
	
	private ArrayList<Cookie> cookiesArrayList = new ArrayList<>();
	private ArrayList<Candy> candyArrayList = new ArrayList<>();
	private ArrayList<Cake> cakeArrayList = new ArrayList<>();


	/**
	 * 
	 */
	public Store() {
		super();
		
		// Added our cookies
		Cookie aCookie = new Cookie("Peanutbutter", 2);
		Cookie aCookie2 = new Cookie("Chocalate Chip", 2);
		Cookie aCookie3 = new Cookie("Snickerdoodle", 3);
		cookiesArrayList.add(aCookie);
		cookiesArrayList.add(aCookie2);
		cookiesArrayList.add(aCookie3);
		
		// Add our cakes
		Cake aCake = new Cake("Peantbutter", 1);
		Cake aCake2 = new Cake("White-with-Buttercream-icing", 1);
		
		// Add our candy
		Candy aCandy = new Candy("Toffy", 2);
		Candy aCandy2 = new Candy("Mr Goodbar", 100);
		Candy aCandy3 = new Candy("Butterscotch", 500);
		
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
	
	
	public ArrayList<Candy> pickSomeCandy(String candyType, int theNumberOfCandiesTheCustomerWants) {
		
		ArrayList<Candy> foundCandies = new ArrayList<>();
		
		
		for (Candy candy : candyArrayList) {
			if (candy.getKind().equalsIgnoreCase(candyType)) {
				if (foundCandies.size() <= theNumberOfCandiesTheCustomerWants) {
					// Add the found cookie
					foundCandies.add(candy);
				}
			}
		}
		
		// Remove the found candies from the stores candies
		for (Candy candy : foundCandies) {
			candyArrayList.remove(candy);
		}
		
		// Did we give them enough candies?  If not then tell them how many we gave them
		if (foundCandies.size() < theNumberOfCandiesTheCustomerWants) {
			System.out.println("Sorry we don't have enought cookies for the number number you wanted!");
			System.out.println("We gave you what we had, which was " + foundCandies.size() + " candy");
		}
		
		return foundCandies;
	}
	
	public ArrayList<Cake> pickSomeCake(String cakeType, int theNumberOfCakesTheCustomerWants) {
		
		ArrayList<Cake> foundCakes = new ArrayList<>();
		
		
		for (Cake cake : cakeArrayList) {
			if (cake.getKind().equalsIgnoreCase(cakeType)) {
				if (foundCakes.size() <= theNumberOfCakesTheCustomerWants) {
					// Add the found cookie
					foundCakes.add(cake);
				}
			}
		}
		
		// Remove the found candies from the stores candies
		for (Cake cake : foundCakes) {
			cakeArrayList.remove(cake);
		}
		
		// Did we give them enough candies?  If not then tell them how many we gave them
		if (foundCakes.size() < theNumberOfCakesTheCustomerWants) {
			System.out.println("Sorry we don't have enought cookies for the number number you wanted!");
			System.out.println("We gave you what we had, which was " + foundCakes.size() + " candy");
		}
		
		return foundCakes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

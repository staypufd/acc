/**
 * 
 */
package main;

import java.util.ArrayList;

import domain.Customer;
import domain.Store;
import domain.treats.ConfectionaryItem;
import domain.treats.Cookie;

/**
 * @author samjr
 *
 */
public class CookieStoreInheritanceLessonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		Store confectionaryStore = new Store();
		
		confectionaryStore.customerEnterStore(customer1);
		ArrayList<Cookie> theStoresCookies = confectionaryStore.whatCookiesAreAvailable();
		
		System.out.println("The stores cookies are: " + theStoresCookies);
		
		ArrayList<Cookie> thePeanutButterCookies = confectionaryStore.pickSomeCookies("Peanutbutter", 3);
//		System.out.println("The peanut butter cookies are: " + thePeanutButterCookies);
		
		customer1.setMyCookies(thePeanutButterCookies);
		
		System.out.println("The customer has these cookies: " + customer1.getMyCookies());
		System.out.println("The store has these cookies: " + confectionaryStore.whatCookiesAreAvailable());

		Cookie theGottenCookie = customer1.getMyCookies().get(0);

		theGottenCookie.eatMe3();
		
		/**
		 *  You can add code that is very much like the above to have the customer pick cakes and candies
		 *  	as well. The methods of whatCakesAreAvailable and whatCandiesAreAvailable are in the Store 
		 *  class as well as pickSomeCandies and pickSomeCakes.
		 *  
		 *  You will will have to add eatMe methods to the Cakes and Candies classes following the 
		 *  pattern you see in Cookie.
		 */
		
		// *****  Put your additional code here to work with the Cakes and Candies *****
		// *****************************************************************************
		
		

	}

}
















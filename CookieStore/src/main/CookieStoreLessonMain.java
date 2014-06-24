/**
 * 
 */
package main;

import java.util.ArrayList;

import domain.Customer;
import domain.Store;
import domain.treats.Cookie;

/**
 * @author samjr
 *
 */
public class CookieStoreLessonMain {

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
	}

}
















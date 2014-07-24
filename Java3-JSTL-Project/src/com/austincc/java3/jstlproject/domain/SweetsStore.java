package com.austincc.java3.jstlproject.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.austincc.java3.jstlproject.domain.Cookie.CookieType;

public class SweetsStore {
	
	private static int NUM_OF_RANDOM_COOKIES = 500;
	
	// Instance variables
	HashMap<Cookie.CookieType, ArrayList<Cookie>> cookies = new HashMap<>();

	public SweetsStore() {
		super();
		
		// Initialize the 
		cookies.put(Cookie.CookieType.BUTTER__PECAN, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.CUSTARD_CREAM, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.FUDGE, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.GINGERBREAD, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.PEANUT_BUTTER, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.SNICKER_DOODLE, new ArrayList<Cookie>());
		cookies.put(Cookie.CookieType.TOLL_HOUSE, new ArrayList<Cookie>());
		
		// Init the cookies hashmap with a random number of different kinds of cookies
		for (int i = 0; i < NUM_OF_RANDOM_COOKIES; i++) {
//			int randomCookieTypeNum = (int)Math.round(Math.random() * Cookie.numberOfTypesOfCookies());
//			Cookie.CookieType randomCookieType = Cookie.CookieType.values()[randomCookieTypeNum];
			
			Random r = new Random();
			CookieType[] cookieTypes = Cookie.CookieType.values();
			CookieType  ct = cookieTypes[r.nextInt(cookieTypes.length)];
			
			Cookie aCookie = new Cookie(ct);
			
			ArrayList<Cookie> aCookieArrayList = cookies.get(ct);
			if ( aCookieArrayList != null ) {
				aCookieArrayList.add(aCookie);
			}
		}
		
		System.out.println(cookies);
	}
	
	public HashMap<Cookie.CookieType, ArrayList<Cookie>> getCookies() {
		return cookies;
	}
	
	public ArrayList<Cookie> getCookiesOfType(Cookie.CookieType cookieType) {
		return cookies.get(cookieType);
	}
	
	public ArrayList<Cookie> getFudgeCookies() {
		ArrayList fc =  cookies.get(Cookie.CookieType.FUDGE);
		return fc;
	}
	
	
}

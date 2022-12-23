//Problem Statement 2:
package collection;

import java.util.HashSet;
import java.util.Iterator;

public class CountrySet 
{
		String country;
		 //creating HashSet and adding elements 
		HashSet<String> H1 = new HashSet();  //set 
		void storeCountryNames(String countryName) {
			H1.add(countryName);
		}
		public String retrieveCountry(String countryName)  { 
			Iterator itr = H1.iterator();  
			while( itr.hasNext()) {  
				System.out.println(itr.next()); 
				if(H1.contains(countryName)) 
					return countryName; 
			}
			return null; }  
		public static void main(String[] args) {
			CountrySet cs= new CountrySet();  
			// name of the countries
			cs.storeCountryNames("India");
			cs.storeCountryNames("Korea");
			cs.storeCountryNames("Japan");
			cs.storeCountryNames("USA");
			cs.storeCountryNames("England");
			System.out.println("Retrieved Country : "+cs.retrieveCountry("USA"));
		}
	}

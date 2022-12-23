package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CMap {  
	private HashMap<String, String> M1;
	
	public CMap() { 
		M1 = new HashMap<String, String>(); 
	}
	
	public HashMap<String, String> 
	storeCountryCapital(String CountryName, String capital) { 
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String retrieveCapital(String CountryName) { 
		return M1.get(CountryName);
	}
	
	public String retrieveCountry(String capitalName) { 
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))  
				return me.getKey(); 
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>(); //Array list created
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
public static void main(String[] args) {
  CMap CMap = new CMap();
//values assigned
	CMap.storeCountryCapital("India", "Delhi");
	CMap.storeCountryCapital("Japan", "Tokyo");
	CMap.storeCountryCapital("USA", "Washington, D.C.");
	CMap.storeCountryCapital("Paris", "London");
// values retrive	
	System.out.println(CMap.retrieveCapital("India"));
	System.out.println(CMap.retrieveCountry("Tokyo"));
	//System.out.println(countryMap.toArrayList());
	
	HashMap<String, String> M2 =CMap.swapKyeValue();
	System.out.println(M2);
}
}

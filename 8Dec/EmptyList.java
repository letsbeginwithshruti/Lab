package collection;

import java.util.ArrayList;
import java.util.List;

public class EmptyList 
{
	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();// declaring ArrayList using List
		col.add("Red");
		col.add("Green");
		col.add("Black");
		col.add("White");
		col.add("Pink");
		System.out.println("Before removing the elements: \n"+col);
		
		System.out.println(col.isEmpty()+" and Not empty");
		col.removeAll(col);  //removeAll()-->removing all the elements
		//printing the output 
		System.out.println("After removing all the elements: \n"+col+" "+col.isEmpty()+
				" and Empty");
	}
}

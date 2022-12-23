/*Problem Statement 1:
Write a Java program to update specific array element by given element*/
package collection;

import java.util.ArrayList;
import java.util.List;

public class ColorList 
{
	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();// declaring ArrayList using List
		col.add("Red");
		col.add("Blue");
		col.add("Green");
		col.add("Black");
		System.out.println("Before Adding Any colours: "+col);
		col.remove(2);
		col.add(2,"Yellow");
		
		System.out.println("After adding colour : "+col);
	}
}

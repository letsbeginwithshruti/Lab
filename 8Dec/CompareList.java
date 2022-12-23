/*Problem Statement 3: Write a Java program to compare two array lists.*/
package collection;
import java.util.ArrayList;
import java.util.List;
public class CompareList 
{
	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();// declaring ArrayList using List
		List<String> col1 = new ArrayList<String>();// declaring ArrayList using List
		col.add("Red");
		col.add("Green");
		col.add("Black");
		col.add("White");
		col.add("Pink");
		System.out.println("Elements of 1st Array List : \n"+col);
		col1.add("Red");
		col1.add("Green");
		col1.add("Black");
		col1.add("Pink");
		System.out.println("Elements of 2nd Array List : \n"+col1);
		List<String>ob=new ArrayList<String>();
		for(String s : col)
			ob.add(col1.contains(s)?"Yes":"No");
		System.err.println("After comparing : \n"+ob);	}	}
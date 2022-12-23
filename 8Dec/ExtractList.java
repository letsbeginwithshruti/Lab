/*Problem Statement 2:
Write a Java program to extract a portion of an array list.*/
package collection;
import java.util.ArrayList;
import java.util.List;
public class ExtractList 
{
	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();// declaring ArrayList using List
		col.add("Red");
		col.add("Green");
		col.add("Orange");
		col.add("White");
		col.add("Black");
		System.out.println("Before Extracting the elements : \n"+col);
		System.out.println("After Extracting the elements ");
		for( int i= 0; i<3; i++)  {  //loop to get the elements till the condition satisfies
			System.out.println(col.get(i)); //printing the elements
		}}}

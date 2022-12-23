/*Write a Java program to remove duplicate characters 
 * from a given string presents in another given string*/
package string;

import java.util.Scanner;

public class DuplicateChar 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String s="Anudip foundation Skill & career development centre";//1st string
		System.out.println(s);//printing the string
	System.out.println("Enter the String");//getting the second string from user
		  
		  String s2=sc.nextLine();//for 2nd string
		System.out.println("After removing the duplicate characters:");
		for(int i=0;i<s.length();i++) {//outer loop for traversing the 1st string
		boolean b=false;
		for(int j=0;j<s2.length();j++) {//inner loop for traversing the 2nd string
			if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s2.charAt(j))){
				b=true;
				break;//breaking the inner loop
			}
			
		}
		if(b==false)
			System.out.print(s.charAt(i));//printing the string
		}}}	 
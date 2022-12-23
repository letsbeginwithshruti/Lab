/*Problem 1.
Write a Java method to check whether every digit of a given 
integer is even. Return true if every digit is odd otherwise false?*/

package pack.com;

import java.util.Scanner;

public class Odd_method 
{  
	public static void main(String s[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer: ");
		no=sc.nextInt();
		System.out.print("Check whether every digit of the said integer is even or not!\n");
        System.out.print(check(no));
        }

  static boolean check(int no)
  { 
	  if(no%2==1)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}
    

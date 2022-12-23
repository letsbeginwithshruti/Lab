package pack.com;

import java.util.Scanner;

public class Position 
{
	public static void main(String args[])
	{
		int n,i,f=0;
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers: "); //input 10 numbers
			a[i]=sc.nextInt();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find: "); //input a number to find
		n=sc.nextInt();
		for(i=0;i<10;i++)
		if(n==a[i]) //checking if the  number input'n' is equal to the numbers given'a[i]
		{
			System.out.println(n+" Found at Position: "+(i+1));//printing the position of the number
			System.out.println("TRUE");
			f=1;
			break;
		}
		if(f==0)
		{
			System.out.println("False"); //prints this message if the number is not found
		}
	}
}
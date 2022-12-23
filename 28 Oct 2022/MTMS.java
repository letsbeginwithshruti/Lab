/*Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables*/

package pack.com;

import java.util.Scanner;

public class MTMS //Main Class
{
	public static void main(String...args) //Main Method
	{
		int s_time,e_time,price;
		String name; 
		// Taking inputs
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the movie name:- ");
		name=sc.nextLine();
		System.out.println("Enter the Starting time:- ");
		s_time=sc.nextInt();
		System.out.println("Enter the Ending time:- ");
		e_time=sc.nextInt();
		System.out.println("Enter the Ticket Price:- ");
		price=sc.nextInt();
		// Created an object of Movie class
		Movie mo=new Movie();
		System.out.println("Movie Details:- \n");
		mo.set_movie(name, s_time, e_time, price);
		mo.get_movie();
	}

}
class Movie //Encapsulated class
{
	//Instance Variables
	
	private int movieStartTime,movieEndTime,MovieTicketPrice; 
	private String movieName;
	public void set_movie(String n,int s,int e,int p) //Setter method
	{
		movieName=n;
		movieStartTime=s;
		movieEndTime=e;	
		MovieTicketPrice=p;
	}
	public void get_movie() //Getter method
	{
		System.out.println("Movie name:- "+movieName);
		System.out.println("Movie Start Time:- "+movieStartTime+"\nMovie End Time: "+movieEndTime+"\nTicket Price:- "+MovieTicketPrice);
	}
}

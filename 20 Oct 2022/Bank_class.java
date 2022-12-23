/*Problem 2.
Banking Operations relate a class with customer private instance variables as accountNumber,accountName,accountBalance and create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two customers*/

package pack.com;

import java.util.Scanner;

public class Bank_class 
{
	public static void main(String args[])
	{
		int accbal,accbal1;
		int accnumber,accnumber1;
		String accname,accname1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of 1st Customer: ");
		accname=sc.nextLine();
		System.out.println("Enter the account number to check: ");
		accnumber=sc.nextInt();
		System.out.println("Enter the Balance: ");
		accbal=sc.nextInt();
		
		
		BankingOperation op=new BankingOperation();
		BankingOperation op2=new BankingOperation();
		op.set_name(accname);
		op.set_amount(accbal);
		System.out.println("Name: "+op.get_name());
		System.out.println("Account Number: "+accnumber);
		System.out.println("Account Balance: "+op.get_amount());
		op.withdrawAmount(600);
		System.out.println("Details of second customer:- ");
		System.out.println("Name: "+op2.get_name());
		System.out.println("Account Number: "+accnumber);
		System.out.println("Account balance: "+op2.get_amount());
			
	}
}
class BankingOperation
{ //private data members
	private int accountNumber;
	private int accountBalance;
	private String accountName;
	
	void create_account(String accname, int accnumber,int accbal )
	{
		accountNumber=accnumber;
		accountBalance=accbal;
		accountName=accname;
	}
	 public void set_amount(int bk)//setter method
	 {
		 accountBalance=bk; 
	 }
	 public int get_amount()//getter method
	 {
		 return accountBalance;
	 }
	 public void set_name(String bk)//setter method
	 {
		 accountName=bk;
	 }
	 public String get_name()//getter method
	 {
		 return accountName;
	 }
	 int withdrawAmount(int w) //method for withdraw money
	 {
		 return w;
	 }
}

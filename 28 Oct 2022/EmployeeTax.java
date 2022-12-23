//PROGRAM 1
package com.cognizant.tax;

public class EmployeeTax 
{
	public static void main(String[] args) 
	{
		TaxCalculator tc=new TaxCalculator();
		tc.BasicSalary=25000;
		tc.citizenship=true;
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
		tc.BasicSalary=125000;
		tc.citizenship=false;
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();	
	}
}
 class TaxCalculator //Another class
 {  
	float BasicSalary;
	float tax;
	boolean citizenship;
	float netSalary;
	
	public void calculateTax() //Method to calculate and print tax
	{
		tax=30*BasicSalary/100;
		System.out.println("\nThe Tax of the employee for the"+BasicSalary+" is "+tax);
	}
	public void deductTax() //Method to calculate and print the net salary
	{
		netSalary=BasicSalary-tax;
		System.out.println("\nThe net salary of the employee "+netSalary);
	}
	public void validateSalary() //Method to check the citizenship eligibility
	{
		if(BasicSalary>100000) 
		{
			System.out.println("\nThe salary and citizenship eligibility: "+citizenship);
		}
		else
		{
			System.out.println("\nThe salary and citizenship eligibility: "+citizenship);
		}
	}
 }

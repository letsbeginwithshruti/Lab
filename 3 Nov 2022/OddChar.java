package pack.com;

public class OddChar 
{
	public static void main(String args[]) //main method
	{
		char ch[]= {'a','b','c','d','e','f','g'}; //declaration of array
		for(int i=0;i<ch.length;i+=2) //for loop to print the characters at odd position
		System.out.print(ch[i]+" "); //printing the values
	}
}


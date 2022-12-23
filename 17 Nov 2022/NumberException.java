/*2.Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.*/
package exception;

class Numbercheckexception extends Exception {//creating custom exception
	public Numbercheckexception(String s) {//creating exception method
		super(s);
	}
}
public class NumberException {
int x, y;
public void check(int a, int b) throws Numbercheckexception {//checking exception
		if (x <= 0 || y <= 0) {//checking if the numbers are less than 0 or 0
			throw new Numbercheckexception("x and y should not be 0");
		}
		else {
			System.out.println("Product of x and y is " + (x * y));
		}
}
	public static void main(String[] args) throws Numbercheckexception {
		NumberException n = new NumberException();//creating object
		n.check(4, -9);//taking numbers
	}
}
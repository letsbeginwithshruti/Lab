package exception;

import java.util.Scanner;
public class AddException {
	public static int addTwoPositive(int x, int y) {
		try {
			if (x < 0 || y < 0) {
				throw new ArithmeticException("Non positive integer sent");
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("The code is executed");
		}
		return x + y;
	}
	public static void main(String[] args)
	{
		addTwoPositive(6, 9); 
		}
}
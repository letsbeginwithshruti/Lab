/*Problem code 2:Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print*/
package thread;
public class EvenOddThread extends Thread{
	public void run1() {
		int i,j;
		for ( i = 1; i <=100; i+=2) {
			try {
				Thread.sleep(500); }
			catch(InterruptedException e) {
				System.out.println(e); }
			System.out.println("Odd numbers are: "+i); }}
	public void run2() {
		for(int j=0;j<=100;j+=2) {
			{  try {
					Thread.sleep(500); }
				catch(InterruptedException e) {
					System.out.println(e); }
				System.out.println("Even numbers are: "+j);}}}
	public static void main(String[] args) {
		EvenOddThread ot=new EvenOddThread();
		EvenOddThread ot1=new EvenOddThread();
	    ot.run2();
		ot1.run1();}}


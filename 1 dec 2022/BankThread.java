package thread;

//1.Implement inter-thread communication by creating banking
//methods like deposit and withdraw.
class Bank {
	int total=50000;
	synchronized void deposit(int amount) {
		System.out.println("Current Amount is: "+total);
		System.out.println("Deposited amount is: "+amount);
		total+=amount;
		System.out.println("deposit is completed");
		System.out.println("Total balance is "+total);
		notify();
		try {
			Thread.sleep(1000);  
			
		}catch(Exception e)   {
			System.out.println(e);
		}
	}
	synchronized void withdraw(int amount1) {
		System.out.println("Money to be Withdrawn is:  20000");
		total-=amount1;
		System.out.println("withdrawl is completed");
		System.out.println("Total balance is "+total);
		notify();
	}}
class Thread4 extends Thread{
	Bank b;
	Thread4(Bank b){
		this.b=b;
	}
	public void run() {
		b.deposit(30000);
	}}
	class Thread5 extends Thread{
		Bank b;
		Thread5(Bank b){
			this.b=b;
		}
		public void run() {
			b.withdraw(20000);}}
	public class BankThread{
public static void main(String[] args) {
	Bank obj=new Bank();
	Thread4 t1=new Thread4(obj);
	Thread5 t2=new Thread5(obj);
	t1.start();
	t2.start();
}}
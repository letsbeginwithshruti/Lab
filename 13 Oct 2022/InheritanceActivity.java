
public class InheritanceActivity 
{
	public static void main(String[] args) {
		Manager m = new Manager(126534, "Peter", "chennai india", 237844, 65000);
		Trainee t = new Trainee(29846, "Jack", "Mumbai india", 448025, 45000);
		System.out.println(t.calculatesalary());
		m.tallowance();
		System.out.println("The transport allowance for the Trainee " + t.calculateTransportAllowance());
	}

}
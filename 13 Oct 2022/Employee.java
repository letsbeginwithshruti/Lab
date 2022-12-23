
public class Employee 
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double BasicSalary;
	double SpecialA = 250.80;
	double Hra = 1000.50;

	public Employee(long Id, String Name, String address, long phone) {
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}

	public double calculatesalary() {
		double salary = BasicSalary + (BasicSalary * SpecialA / 100) + (BasicSalary * Hra / 100);
		return salary;
	}

	public double calculateTransportAllowance() {
		double transportAllowance = 10 / 100 * BasicSalary;
		return transportAllowance;
	}
}

class Manager extends Employee {
	double Salary;

	public Manager(long Id, String Name, String address, long phone, double Salary) {
		super(Id, Name, address, phone);
		this.Salary = Salary;
		super.BasicSalary=Salary;

	}

	public void tallowance() {
		double transportAllowance = 15 * BasicSalary / 100;
		System.out.println("Transport Allowance of the manager is " + transportAllowance);
	}
}

class Trainee extends Employee {
	double Salary;

	public Trainee(long Id, String Name, String address, long phone, double Salary) {
		super(Id, Name, address, phone);
		this.Salary = Salary;
		super.BasicSalary=Salary;

	}

}
// package msjava;

class Employee{
	
	private String Name;
	private int IDnumber;
	private String Department;
	private double Salary;
	
	public void setName(String n) {
		this.Name=n;
	}
	public void setID(int id) {
		this.IDnumber=id;
	}
	public void setDept(String d) {
		this.Department=d;
	}
	public void setSalary(double s) {
		this.Salary=s;
	}
	
	public String getName() {
		return Name;
	}
	public int getID() {
		return IDnumber;
	}
	public String getDept() {
		return Department;
	}
	public double getSalary() {
		return Salary;
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee g=new Employee();
		Employee s=new Employee();
		
		System.out.println("Employee 1\n");
		
		s.setName("Ben");
		s.setID(5);
		s.setDept("Manager");
		s.setSalary(34000);
		
		System.out.println("Name : "+s.getName());
		System.out.println("ID : "+s.getID());
		System.out.println("Department : "+s.getDept());
		System.out.println("Salary : "+s.getSalary());
		
		System.out.println("\nEmployee 2\n");
		
		g.setName("Malenia");
		g.setID(6);
		g.setDept("Receptionist");
		g.setSalary(25000);
		
		System.out.println("Name : "+g.getName());
		System.out.println("ID : "+g.getID());
		System.out.println("Department : "+g.getDept());
		System.out.println("Salary : "+g.getSalary());



	}

}

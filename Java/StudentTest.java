// package msjava;

class Student{
	private String name;
	private int rollNo;
	private double percentage;
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setRollNo(int r) {
		this.rollNo=r;
	}
	public void setPercentage(double p) {
		this.percentage=p;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		Student s=new Student();
		
		s.setName("Anurag");
		s.setPercentage(67);
		s.setRollNo(3);
		
		System.out.println("Name : "+s.getName());
		System.out.println("RollNo : "+s.getRollNo());
		System.out.println("Percentage: "+s.getPercentage()+"%");	
		
	}

}

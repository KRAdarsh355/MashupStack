// package msjava;

class Course{
	
	String courseName;
	int duration;
	int studentNumbers;
	static final String creatorName="CodeMentor Academy";
	static int totalStudents=0;
	
	Course(String courseName,int duration,int studentNumbers){
		this.courseName=courseName;
		this.duration=duration;
		this.studentNumbers=studentNumbers;
		totalStudents+=studentNumbers;
	}
	void display() {
		System.out.println(creatorName+"\n");
		System.out.println("Course name : "+courseName);
		System.out.println("Duration : "+duration);
		System.out.println("Number of student enrolled : "+studentNumbers);
		System.out.println("Total students in the Academy : "+totalStudents);
	}
	static class Platform{
		void print() {
			System.out.println("Courses are hosted on CodeMentor \n");
		}
	}
}
public class CourseTest {

	public static void main(String[] args) {
		
		Course c1=new Course("MernStack",5,14);
		Course c2=new Course("C++",7,10);
		Course c3=new Course("Python",5,12);
		
		Course.Platform p1=new Course.Platform();
		Course.Platform p2=new Course.Platform();
		Course.Platform p3=new Course.Platform();
		
		c1.display();
		p1.print();
		
		c2.display();
		p2.print();
		
		c3.display();
		p3.print();
		
	}

}

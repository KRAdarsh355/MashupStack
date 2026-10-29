// package msjava;

class course{
	
	String courseName;
	int duration;
	
	static int courseCount=0;
	static final String CenterName="LearnNoLimit";
	
	course(){
		this.courseName="none";
		this.duration=0;
		courseCount++;
	}
	
	course(String courseName,int duration){
		this.courseName=courseName;
		this.duration=duration;
		courseCount++;
		
	}
	void display() {
		System.out.println("Center : "+CenterName);
		System.out.println("Course : "+courseName);
		System.out.println("Duration :"+duration+" weeks");
		System.out.println("No of courses created: "+courseCount);
		
	}
	class CourseMaterial{
		void materials() {
			System.out.println("Materials provided for this course.\n\n");
		}
	}
	
	
}

public class CourseInfo {

	public static void main(String[] args) {
		course c1=new course();
		course c2=new course("Java",6);
		
		
		course.CourseMaterial m1 = c1.new CourseMaterial();
		course.CourseMaterial m2=c2.new CourseMaterial();
		
		System.out.println("Course 1 \n");
		c1.display();
		m1.materials();
		
		System.out.println("Course 2 \n");
		c2.display();
		m2.materials();
		
		
		}

}

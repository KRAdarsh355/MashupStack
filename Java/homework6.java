//package msjava;

public class homework6 {
	public static void main(String args[]) {
		int[] marks= {78,82,91,65,34};
		int average;
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
			if(marks[i]<35) {
				System.out.println("Fail");
				System.exit(0);
			}
			
		}
		System.out.println("Total marks: "+total);
		average=total/marks.length;
		if(average>=90) {
			System.out.println("Grade A");
		}
		else if(average>=75 && average<=89) {
			System.out.println("Grade B");
		}
		else if(average>=60 && average<=74) {
			System.out.println("Grade C");
		}
		else if(average<60) {
			System.out.println("Grade D");
		}
	}
}


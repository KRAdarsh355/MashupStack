//package msjava;

public class classwork6 {

	public static void main(String[] args) {
		int sum=0;
		int[] num= {20,15,30,0,25};
		for(int i=0;i<num.length;i++){
			if(num[i]==0) {
				System.out.println("Out of stock");
				System.exit(0);
			}
			if(num[i]!=0) {
				sum=sum+num[i];
			}
		}
			if(sum<50) {
				System.out.println("Low Stock");
			}
			else if(sum>=50 && sum<100) {
				System.out.println("Moderate Stock");
			}
			else if(sum>=100) {
				System.out.println("Good Stock");
			}
			
		
	}
}

// package msjava;

public class homework5 {

	public static void main(String[] args) {
		int[][] sales= {{100,80,50},
						{120,90,60},
						{110,90,40},
						{130,60,70},
						{90,100,70}};
		int total[]=new int[3];
		
		for(int i=0;i<sales.length;i++) {
			for(int j=0;j<sales[i].length;j++) {
			total[j]+=sales[i][j];
			}
		}
		
		for(int i=0;i<total.length;i++) {
			if(total[i]>=500) {
				System.out.println("For product "+(i+1)+" = "+total[i]+" - Target achieved.");
				
			}
			else if(total[i]>=300 && total[i]<=499) {
				System.out.println("For product "+(i+1)+" = "+total[i]+" - Average Performance.");
				
			}
			else if(total[i]<=300) {
				System.out.println("For product "+(i+1)+" = "+total[i]+" - Needs Improvement.");
				
			}
		}


		}
		
}



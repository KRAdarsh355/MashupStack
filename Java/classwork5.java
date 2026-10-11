// package msjava;

public class classwork5 {

	public static void main(String[] args) {
		int[] score= {91,77,55,63,39};
		int i;
		for(i=0;i<score.length;i++) {
			if(score[i]>=
                90) {
				System.out.println(score[i]+" = Excellent");
			}
			else if(score[i]>75 && score[i]<89) {
				System.out.println(score[i]+" = Good");
			}
			else if(score[i]>50 && score[i]<74) {
				System.out.println(score[i]+" = Average");
			}
			else if(score[i]<50) {
				System.out.println(score[i]+" = Fail");
			}
			
		}

	}

}

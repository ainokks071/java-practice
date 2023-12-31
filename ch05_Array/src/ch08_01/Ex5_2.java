package ch08_01;


public class Ex5_2 {

//	배열의 총합과 평균 구하기 
	public static void main(String[] args) {
		
		int[] score = {100, 30, 44, 60, 83, 93};
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = (double)sum / score.length;
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
		
		
		
		
		
	}
}

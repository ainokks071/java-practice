package ch08_01;


public class Ex5_3 {

//	배열의 최댓값과 최솟값 구하기. 
	public static void main(String[] args) {
		
		int[] score = {70, 55, 44, 93, 83, 91};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}

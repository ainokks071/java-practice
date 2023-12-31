package ch08_01;

import java.util.Arrays;

public class Ex5_4 {

//	배열 무작위로 섞기 : 횟수 100번
	public static void main(String[] args) {
//		   			   0   1   2   3   4   5	
		int[] score = {70, 55, 44, 93, 83, 91};
		
		int tmp = 0;
		int i = 0;
		int j = 0;
		
		for(int a = 1; a <= 100; a++ ) {
			i = (int)(Math.random()*6);
			j = (int)(Math.random()*6);
			tmp = score[i];
			score[i] = score[j];
			score[j] = tmp;
		}
		
		System.out.println(Arrays.toString(score));
		
		
		
	}
}

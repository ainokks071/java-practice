package ch14_01;

import java.util.Arrays;

public class Ex14_000 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		Arrays.setAll(arr, (i)-> (int)(Math.random()*5)+1 );
		
		System.out.println(Arrays.toString(arr));
		
	}

}

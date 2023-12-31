package ch14_01;

import java.util.Arrays;

public class Ex14_00 {

	public static void main(String[] args) {
		
		System.out.println((int)(Math.random() * 5) + 1 );
		
		int[] arr = new int[5];
		Arrays.setAll(arr, (i) -> (int)(Math.random() * 5) + 1 );
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} 
	}

}

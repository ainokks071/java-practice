package array;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		//ex1)
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//ex2)
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		//ex3)
		
		
	}

}

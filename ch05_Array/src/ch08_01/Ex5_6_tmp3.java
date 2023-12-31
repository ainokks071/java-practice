package ch08_01;

import java.util.Arrays;

public class Ex5_6_tmp3 {

//	Arrays 클래스 활용해보기 
//	String toString(int[] arr)
//	int[] copyOf(int[] arr, int newlength)
//	int[] copyOfRange(int[] arr, int from, int to)
//	void sort(int[] arr)
	public static void main(String[] args) {
		
		int[] arr1 = {5, 4, 3, 1, 2};
		int[] arr2 = {2, 5, 1, 4, 3};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.equals(arr1, arr2)); 
		int[] arr3 = Arrays.copyOf(arr1, 3); //3개 복사
		System.out.println(Arrays.toString(arr3));
		arr3 = Arrays.copyOfRange(arr1, 2, 5); // 2~4 : [3, 1, 2]
		System.out.println(Arrays.toString(arr3));
		
//		오름차순 정렬 !
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
	}
}

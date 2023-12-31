package ch08_01;

import java.util.Arrays;

public class Ex5_1_tmp3 {

	public static void main(String[] args) {
//		배열의 초기화 및 출력 !
		
//		배열 초기화 방법1. 반복문(규칙성 필요) 방법2. 배열 생성 시 초기화 
//		배열 출력 방법1. 반복문 방법2. Array.toString() 메서드 활용 -> 문자열로 반환 
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 + (i * 10);
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		
		int[] arr2 = {10, 20, 30, 40 ,50};
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}
}

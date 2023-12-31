package ch08_01;

public class Ex5_1_tmp {

	public static void main(String[] args) {

//		int[] arr; 		  //1. 배열의 선언 
//		arr = new int[5]; //2. 배열의 생성
		
		int[] arr = new int[5]; //배열의 선언과 생성을 한번에.
//		배열 요소에 값 대입(쓰기)
		arr[3] = 100;
//		배열 요소의 값 읽기 
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("arr[4] = " + arr[4]);
		
//		배열요소에 저장된 값을 다른 변수에 넣기.
		int value = arr[3];
		System.out.println("value = " + arr[3]);
	}

}

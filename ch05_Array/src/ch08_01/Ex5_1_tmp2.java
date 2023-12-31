package ch08_01;

public class Ex5_1_tmp2 {

	public static void main(String[] args) {
		
		//index 범위 : 0 ~ 5
		int[] arr = new int[5]; //길이가 5인 int형 배열 arr 생성 // 0으로 자동 초기화됨.
		System.out.println("배열의 길이 = " + arr.length); //arr.length : 상수.
		
//		에러. 배열의 index 범위를 벗어남 ! 
//		for(int i = 0; i < 10; i++) {
//			System.out.println("arr["+i+"] = " + arr[i]);
//		}
		
		//arr.length를 이용하면, 배열의 길이가 변경 되어도, ArrayIndexOutofBounds를 피할 수 있다.
//		배열요소에 저장된 값 읽기.
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}

	}

}

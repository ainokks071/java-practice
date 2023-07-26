package array;

public class ArrayTest {

	public static void main(String[] args) {

		//지역변수 : 반드시 초기화 해야함.
		//int score;
		//System.out.println(score); 에러 
		
		Array arr = new Array();		
		arr.init();
		arr.print();
//		System.out.println(arr); //객체의 주소값.
//		System.out.println(arr.score);    //인스턴스 기본형 변수 : 객체 생성 시, 자동 초기화! 0 
//		System.out.println(arr.scoreArr); //인스턴스 참조형 변수 : 객체 생성 시, 자동 초기화! null
		
		int[] scoreArr; //배열선언 : 배열을 다루기 위한 참조변수생성 
//		System.out.println(score); 지역변수 : 반드시 초기화 해야함. 에러 
		scoreArr = new int[5]; //배열생성 : 생성된 배열의 주소값을 참조변수에 저장 
		System.out.println(scoreArr); //배열의 주소값.
		System.out.print(scoreArr[0]);
		System.out.print(scoreArr[1]);
		System.out.print(scoreArr[2]);
		System.out.print(scoreArr[3]);
		System.out.println(scoreArr[4]);
		
	}

}



class Array {
	
	//인스턴스변수 
	
	int score;
	int[] scoreArr = new int[5];
	
	int value;
	
	void init() {
		
		//50, 60, 70 ... : 50부터 시작, 10씩 차이.
		for(int i = 0; i < scoreArr.length; i++) {
		scoreArr[i] = 50 + (10 * i);
		}
		
		value = scoreArr[3];
	}
	
	void print() {
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.println("scoreArr["+i+"] " + scoreArr[i]);
			}
		
		System.out.println("인덱스 3번의 값 ? : "+value);
	}
	
}

package varex;

public class VarEx3 {

	public static void main(String[] args) {

		//메인메서드 내의 변수들은 싹다 지역변수!! ( cf; 인스턴스변수, 클래스변수 )
		//변수, 상수 : 선언과 동시에 초기화하는 것이 좋다.

		//		지역변수는 반드시 초기화해야 읽을 수 있다.
		//		The local variable score may not have been initialized
		int score = 200;
		score = 300; //변수에 저장된 값 바꾸기!
		System.out.println(score); //300

		//		상수에 이미 저장된 값을 변경할 수는 없다.
		final int SCORE;
		SCORE = 500;
		//		SCORE = 1000; 에러발생!! 상수에 이미 저장된 값을 변경할 수는 없다.
		//		에러내용 : The final local variable(상수) SCORE may already have been assigned	

		System.out.println(SCORE); //500

		System.out.println();

		/* 변수의 타입, 리터럴(값)의 타입 (논리형, 문자형, 정수형, 실수형, 문자열)
		 */

		//1.논리형
		boolean power = true;
		System.out.println(power);

		//2.문자형
		char ch = 'A';
		System.out.println(ch);

		//3.정수형 (byte, short, int, long 4가지)
		byte b = 127; //int타입 리터럴 , 단, byte 범위는 -128~127
		System.out.println(b);
		short s = 300; //int타입 리터럴 , 단, short 범위는 -xxx ~ xxx
		System.out.println(s);

		int a1 = 1000; //int타입 리터럴 
		System.out.println(a1);

		int a2 = 'A'; // 변수int(그릇) > 문자char(물건) : 가능!!
		System.out.println(a2); //문자 A의 숫자코드 출.

		long l1 = 3_000_000_000L; //30억!! 20억 초과는 long타입 리터럴 : 반드시 l 붙여야함.
		System.out.println(l1);
		long l2 = 300_000_000; //3억!! 20억 미만은 int타입 리터럴 : l 생략가능.
		System.out.println(l2);

		//4. 실수형
		float f1 = 3.14f; //float타입 리터럴 : 반드시 f 붙여야함.
		System.out.println(f1);
		double d1 = 3.14; //double타입 리터럴 : d 생략가능. 
		System.out.println(d1);
		double d9 = 3.14f; //가능! 변수double(그릇) > 실수float(물건)
		System.out.println(d9);

		double d2 = 10.; 
		System.out.println(d2);
		double d3 = .1;
		System.out.println(d3);
		float f2 = 10f;
		System.out.println(f2);
		double d4 = 10e3; //10 * (e : 10의 n제곱) -> 실수!!
		System.out.println(d4);

		//5. 문자열
		String str1 = "ABC";
		String str2 = "가나다";
		String str3 = str1 + str2;
		System.out.println(str3);

		//문자열 결합 
		System.out.println("" + 7 + 7); //"77"
		System.out.println(7 + 7 + ""); //"14"

		int test = 7;
		//String test2 = "" + test;
		System.out.println("7은 문자열입니다 : " + test);

		//숫자를 문자열로 변환하는 방법 1
		String str4 = ""; //빈 문자열 
		int a4 = 10;
		String str5 = str4 + a4;
		System.out.println(str5);

		//숫자를 문자열로 변환하는 방법 2
		int a5 = 33;
		System.out.println("제 나이는 " + a5 + "살 입니다.");





	}

}

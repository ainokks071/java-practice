package ch08_01;

public class ExceptionTest /*extends Object*/ {

	public static void main(String[] args) {
//	main함수는 자바 프로그램의 시작점이다.
//	자바가상머신(JVM)은 main이라는 이름을 가진 메서드를 찾아 프로그램을 시작한다.
//	- public : JVM이 main함수를 찾을 수 있도록 한다.
//	- static : JVM이 main함수를 "곧바로 실행"할 수 있도록 한다.
//	- void : main함수가 종료되면 프로그램도 종료되므로, return값이 필요하지 않다.(return값이 무의미하다.)
//	- String[] args : 커맨드라인 등을 통해, main함수 내부에서 사용할 수 있는 String 데이터를 전달할 수 있다.
//	  -> main 함수는 프로그램 실행 시 처음으로 수행되는 함수이기 때문에, 외부로부터 값을 입력받을 수 있어야 한다.(매개변수가 존재하는 이유.)

		
//		* 컴파일, 컴파일러
//		- 컴파일 : *.java(소스파일) -> .class(클래스파일) by javac
//				 -> 저장 시, 이클립스가 자동으로 해준다.(Project -> Build Automatically 체크.)
//		- 컴파일러(javac.exe)가 하는 일 
//			1. 구문체크(문법 오류) -> 컴파일 에러 발생.
//			2. 번역(컴파일)
//			3. 최적화 (단순 계산 등 int i = 8 + 5;)
//			4. 생략된 코드 추가(extends Object)
		
		
//		1) 컴파일 에러(컴파일 명령어 : javac ExceptionTest.java) : 컴파일할 때 발생하는 에러
//		예시) 문법 에러 -> system.out.println("안녕하세요"); 소문자 s -> 컴파일에러 발생. -> 실행 불가능.
		
//		2) 런타임 에러(실행 명령어 : java ExceptionTest.class) : 실행 중 발생하는 에러 -> 실행하다가 프로그램 종료
//		예시) Run-> Run Config -> Arguments -> String[] args 매개변수에 값 넣어보기.
//		System.out.println(args[0]); -> 런타임 에러 발생 !
//		String[] args 매개변수에 넘어온 값이 없는데, 꺼내려고 한다. 문법적 에러는 없지만, 실행 중 에러(예외.) 발생.
//		에러메세지 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0(길이가 0인 배열..)
		
		
		
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열 인덱스 초과 접근 예외 발생");
			ae.printStackTrace();
		}
		
		try {
			System.out.println(0/0);
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눈 예외 발생");
			ae.printStackTrace();
		}
		
		throw new RuntimeException();
		
	}

}


public class ExceptionTest /*extends Object*/ {

//	main 함수는 프로그램 실행 시 처음으로 수행되는 함수이기 때문에, 외부로부터 값을 입력받을 수 있어야 합니다.
//	main함수는 자바 프로그램의 시작점이다.
//	자바가상머신(JVM)은 main이라는 이름을 가진 메서드를 찾아 프로그램을 시작한다.
//	- public : JVM이 main함수를 찾을 수 있도록 한다.
//	- static : JVM이 main함수를 곧바로 실행할 수 있도록 한다.
//	- void : main함수가 종료되면 프로그램도 종료되므로, return값이 필요하지 않다.
//	- String[] args : 커맨드라인 등을 통해, main함수 내부에서 사용할 수 있는 String 데이터를 전달할 수 있다.

	public static void main(String[] args) {
		
//		컴파일 에러(javac ExceptionTest.java ) : 컴파일할 때 발생하는 에러 (자바컴파일러 : javac.exe) -> 저장 시, 이클립스가 자동으로 해준다.
		
//		예시) 문법 에러 -> system.out.println("안녕하세요");
		
//		컴파일러가 하는일
//		1. 구문체크(문법 오류)
//		2. 번역
//		3. 최적화 (단순 계산 등), 생략된 코드 추가(extends Object)
		
		
//		런타임 에러(java ExceptionTest ) : 실행 중 발생하는 에러
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//		Run-> Run Config -> 매개변수에 값 넣어보기.
//		String[] args 매개변수에 넘어온 값이 없는데, 꺼내왔음. 문법적 에러는 없지만, 예외 발생.
		System.out.println(args[0]);
		
		
		
		
	}

}

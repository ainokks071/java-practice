package ch08_02;

public class Ex8_instanceof {

	//instanceof 연산자 사용 예시 
	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(0/0); //ArithmeticException 발생 ! -> 객체 생성.
		} catch (Exception e) {
			if(e instanceof ArrayIndexOutOfBoundsException) {
				ArrayIndexOutOfBoundsException e1 = (ArrayIndexOutOfBoundsException)e;
				System.out.println("배열 예외 캐치했습니다.");
				e1.printStackTrace();
			} else if(e instanceof ArithmeticException) {
				 ArithmeticException e2 = (ArithmeticException)e;
				 System.out.println("산수 예외 캐치했습니다.");
				 e2.printStackTrace();
			}
		} 
		System.out.println(2);
		//1. 산수예외캐치했습니다. 에러메세지. 2.
		
		System.out.println(1);
		try {
			System.out.println(0/0); //ArithmeticException 발생 ! -> 객체 생성.
		} catch (Exception e) {
			System.out.println("어떤 예외인지 알려주세요");
			e.printStackTrace();
		} 
		System.out.println(2);
		//1.에러메세지. 2.
		
	}

}

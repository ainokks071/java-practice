package ch08_02;

public class Ex8_4 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 발생 ! -> 객체 생성.
			System.out.println(4);
			
		} catch (ArithmeticException ae) { //참조변수 ae가 예외객체 참조
			if(ae instanceof ArithmeticException) { // ae가 ArithmeticException으로 형변환 가능하니 ?
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");		
		}
		System.out.println(6);
		//1 2 3 true ArithmeticException 6
		
		
		
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 발생 ! -> 객체 생성.
			System.out.println(4);
		} catch (Exception e) { //참조변수 e가 예외객체 참조 (다형성)
			if(e instanceof ArithmeticException) { // e가 ArithmeticException으로 형변환 가능하니 ?
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} 
		System.out.println(6);
		//1 2 3 true ArithmeticException 6
		
		
		
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]); // ArrayIndexOutofBoundsException 발생 ! -> 객체 생성.
			System.out.println(4);
			
		} catch (ArithmeticException ae) { //참조변수 aibe가 예외객체 참조
			if(ae instanceof ArithmeticException) { // e가 ArithmeticException으로 형변환 가능하니 ?
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException aibe) {
			if(aibe instanceof ArrayIndexOutOfBoundsException) { // e가 ArithmeticException으로 형변환 가능하니 ?
				System.out.println("true");
			}
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		System.out.println(6);
//		1 2 3 true ArrayIndexOutOfBoundsException 6

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 발생 ! -> 객체 생성.
			System.out.println(4);
			
		} catch (ArrayIndexOutOfBoundsException aibe) { //참조변수 e가 예외객체 참조
			if(aibe instanceof ArrayIndexOutOfBoundsException) { // e가 ArithmeticException으로 형변환 가능하니 ?
				System.out.println("true");
			}
			System.out.println("ArrayIndexOutOfBoundsException");
		} 
		
		System.out.println(6);
//		1 2 3 : 예외처리 실패


		
		
		

	}
}

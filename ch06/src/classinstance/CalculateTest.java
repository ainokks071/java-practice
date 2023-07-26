package classinstance;

import java.util.Scanner;

public class CalculateTest {

	public static void main(String[] args) {

		System.out.println("두 수의 '계산식'을 차례대로 입력하세요 .");
		
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		scanner.nextLine(); //숫자 입력 후, 문자열 입력 시, 그 사이에 nextLine() 추가! (개행문자읽기여부)
		
		String a = scanner.nextLine();
		double y = scanner.nextDouble();
		
		Calculate calc = new Calculate(); //객체 생성 
		calc.cal(x, a, y); //생성된 객체의 메서드 사용 
	}
	
}

class Calculate {
	
	//메서드는 클래스영역에 존재!
	void cal(double x, String a, double y) {

		if(a.equals("+")) {	
			System.out.println("두 수의 합은 " + (x+y) + "입니다.");
		} else if(a.equals("-")) {
			System.out.println("두 수의 차는 " + (x-y) + "입니다.");
		} else if(a.equals("*")) {
			System.out.println("두 수의 곱은 " + (x*y) + "입니다.");
		} else if(a.equals("/")) {
			System.out.println("두 수의 나눗셈은 " + (x/y) + "입니다.");
		} else {
			System.out.println("ㅋㅋ");
		}
			
	}
	
}
package varex;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("숫자(정수)를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		//스캐너 객체 생성 
		int input1 = scanner.nextInt(); 
		int input2 = scanner.nextInt();
		//nextInt()메소드 : 입력대기 상태에 있다가, 사용자가 입력을 마치고 엔터키를 누르면, 입력한 내용이 정수로 반환된다.
		System.out.println("숫자 " + input1 + "와(과) " + input2 + "을(를) 입력하셨습니다.");
	}

}

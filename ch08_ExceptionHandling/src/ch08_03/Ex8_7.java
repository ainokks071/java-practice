package ch08_03;

public class Ex8_7 {

	public static void main(String[] args) {
		
		//1. checked예외 (Exception과 그 자손들) : 예외처리(try ~ catch)필수, 예외처리 하지 않으면 컴파일 안됨.
		
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//2. unchecked예외 (RuntimeException과 그 자손들) : 예외처리(try ~ catch)선택, 예외처리 하지 않으면 컴파일은 되지만 실행 안됨.
		
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

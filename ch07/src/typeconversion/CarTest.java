package typeconversion;

public class CarTest {

	public static void main(String[] args) {
		//참고))지역변수는 반드시 초기화 해라.
		
		//참조변수의 형변환.
		FireEngine fe1 = new FireEngine();
		//fe1은 모든 멤버 5개 사용 가능.
		fe1.water();
		
		//자식-> 부모로 형변환.
		//c1은 멤버 4개만 사용 가능.
		Car c1 = (Car)fe1;
		//c1.water(); 불가능!!
		
		//부모-> 자식으로 형변환.
		FireEngine fe2 = (FireEngine)c1;
		//다시, fe2는 모든 멤버 5개 사용 가능.
		fe2.water();
		
		
		Car c2 = new Car();
		
		//부모 -> 자식으로 형변환. 
		//컴파일은 OK but, 실행 중 에러 발생!!!!!		java.lang.ClassCastException 클래스형변환에러!!
//		FireEngine fe3 = (FireEngine)c2;
		//fe3.water();
		
		
		
		
	}

}

class Car { //멤버 4개 
	
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{ //멤버 5개 
	void water() {
		System.out.println("water!!!");
	}
}

